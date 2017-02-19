package coinpurse;

/**
* coin is represented to money with fixed value and currency
* @author Poorin Pichayamongkol.  
*/
public class Coin implements Comparable<Coin>, Valuable {
	public static final String DEFAULT_CURRENCY = "Baht";
    /** Value of the coin. */
    private final double value;
    /** The currency, of course. */
    private final String currency;
    
    /**
     * A constructor initialize with given value using the default currency.
     * @param value is value of the coins.
     */
    public Coin( double value ) {
        this.value = value ;
        this.currency = DEFAULT_CURRENCY;
    }
    
    /**
     * A constructor initialize with given value and currency.
     * @param value is the value of coins.
     * @param currency is currency of coin that was given.
     */
    public Coin( double value, String currency ) {
    	this.value = value;
    	this.currency = currency;
    }

/**
 * Method that return value of coin.
 * @return value of coin.
 */
    public double getValue( ) { 
    	return this.value ;
    } 
    
/**
 * Method that return currency of coin.
 * @return currency of coin.
 */
    public String getCurrency() { 
    	return this.currency ;
    }
    
/**
 * Method that check the value of coin with other coin.
 * @param obj the coin that need to compare.
 * @return true if the value of coin is equal.
 * 		   false if the value of coin is not equal.
 */
    public boolean equals(Object obj) {
    	if (obj==null)return false;
    	if (obj.getClass()!=this.getClass())return false;
    	Coin other = (Coin) obj;
    	if (value == other.value)return true;
    	return false;
    }
    
/**
 * Method that compare the value of coins and return 1 if value is greater,
 * 0 if value is equal,-1 if value is less. 
 * @param c is the value of coin that need to compare to.
 * @return 1 if value is greater.
 * 		   0 if value is equal.
 * 		   -1 if value is less. 
 */
    public int compareTo(Coin c){
		if(c == null)return -1;
    	if(this.value > c.value)return 1;
    	else if(this.value < c.value)return -1;
    	else return 0;
    }
    
/**
 * return the description of this Coin class in String.
 * @return the String that describe the Coin class.
 */
    public String toString() { 
    	return this.value+"-"+this.currency; 
    }  
}


