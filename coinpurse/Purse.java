package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
*  A coin purse contains coins.
*  You can insert coins, withdraw money, check the balance,
*  and check if the purse is full.
*  When you withdraw money, the coin purse decides which
*  coins to remove.
*  
*  @author Poorin Pichayamongkol.
*/
public class Purse {
	/** Collection of objects in the purse. */
	List<Valuable> money;
	Valuable[] array = new Valuable[20];
	
    /** Capacity is maximum number of coins the purse can hold.
     *  Capacity is set when the purse is created and cannot be changed.
     */
    private final int capacity;
    
    /** 
     *  Create a purse with a specified capacity.
     *  @param capacity is maximum number of coins you can put in purse.
     */
    public Purse( int capacity ) {
    	this.capacity = capacity;
    	money = new ArrayList<>();
    }

    /**
     * Count and return the number of coins in the purse.
     * This is the number of coins, not their value.
     * @return the number of coins in the purse
     */
    public int count() { 
    	return money.size(); 
    }
    
    /** 
     *  Get the total value of all items in the purse.
     *  @return the total value of items in the purse.
     */
    public double getBalance() {
    	double balance = 0;
    	for(Valuable value : this.money){
    		balance += value.getValue();
    	}
    	return balance;
    }

    
    /**
     * Return the capacity of the coin purse.
     * @return the capacity
     */
    //TODO write accessor method for capacity. Use Java naming convention.
    public int getCapacity() { 
    	return this.capacity; 
    }
    
    /** 
     *  Test whether the purse is full.
     *  The purse is full if number of items in purse equals
     *  or greater than the purse capacity.
     *  @return true if purse is full.
     */
    public boolean isFull() {
        if(this.getCapacity() == this.count()){
        	return true;
        }
        return false;
    }

    /** 
     * Insert a coin into the purse.
     * The coin is only inserted if the purse has space for it
     * and the coin has positive value.  No worthless coins!
     * @param coin is a Coin object to insert into purse
     * @return true if coin inserted, false if can't insert
     */
    public boolean insert( Valuable valuable ) {
        // if the purse is already full then can't insert anything.
    	if(valuable.getValue() <= 0 || this.count()==this.getCapacity()){
    		return false;
    	}
    	else {
    		this.money.add(valuable);
    		return true;
    	}
    }
    
    /**  
     *  Withdraw the requested amount of money.
     *  Return an array of Coins withdrawn from purse,
     *  or return null if cannot withdraw the amount requested.
     *  @param amount is the amount to withdraw
     *  @return array of Coin objects for money withdrawn, 
	 *    or null if cannot withdraw requested amount.
     */
    public Valuable[] withdraw( double amount ) {
    	ArrayList<Valuable> templ = new ArrayList<Valuable>();
        if (amount < 0){
        	return null;
        }
	   /*
		* See lab sheet for outline of a solution, 
		* or devise your own solution.
		*/
		
		// Did we get the full amount?
		// This code assumes you decrease amount each time you remove a coin.
		if ( amount > 0 ){
			for(int i = money.size()-1;i >= 0;i--){
				if(money.get(i).getValue() <= amount){
					templ.add(money.get(i));
					amount -= money.get(i).getValue();
					money.remove(i);
				}
			}
			if(amount > 0){
				money.addAll(templ);
				return null;
			}
			
			
			// failed. Don't change the contents of the purse.
		}
		
		// Success.
		// Remove the coins you want to withdraw from purse,
		// and return them as an array.
		// Use list.toArray( array[] ) to copy a list into an array.
		// toArray returns a reference to the array itself.
		Valuable[] array = new Valuable[templ.size()];
		templ.toArray(array);
        return array;
	}
  
    /** 
     * toString returns a string description of the purse contents.
     * It can return whatever is a useful description.
     */
    public String toString() {
    	return this.count()+" coins with value "+this.getBalance();
    }
}

