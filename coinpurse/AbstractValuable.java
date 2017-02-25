package coinpurse;

/**
 * Abstract class that contains many methods of coin and bank-note 
 * so its can do everything that coin class and bank-note class do . 
 * @author Poorin Pichayamongkol
 *
 */
abstract class AbstractValuable implements Valuable, Comparable{
	protected double value;
	protected String currency;
	
	/**
	 * Constructor initialize the value and currency of money .
	 * @param value is the value of money .
	 * @param currency is the currency of money .
	 */
	public AbstractValuable(double value, String currency){
		this.value = value;
		this.currency = currency;
	}
	
	/**
	 * Method for compare the value of money in the same currency
	 * @param c is the object to compare .
	 * @return -1 if c is null and other money have lesser value than c value .
	 * 			1 if other money have greater value than c value .
	 * 			0 if other money have equal value c value .
	 */
	public int compareTo(AbstractValuable c){
//		if(c == null)return -1;
//    	if(this.getValue() > c.getValue())return 1;
//    	else if(this.getValue() < c.getValue())return -1;
//    	else return 0;
		if ( c == null ) return -1;
		if ( this.getCurrency().equalsIgnoreCase(c.getCurrency())){
			if(this.getValue() > c.getValue())return 1;
			else if(this.getValue() < c.getValue())return -1;
			else return 0;
		}
		else return 0;
    }
	
	/**
	 * Method to compare each objects that have the same value and the same class 
	 * @param obj the coin that need to compare.
	 * @return true if the value are equals .Otherwise it will return false .
	 */
	public boolean equals(Object obj) {
    	if (obj==null)return false;
    	if (obj.getClass()!=this.getClass())return false;
    	AbstractValuable other = (AbstractValuable) obj;
    	if (this.getValue() == other.getValue())return true;
    	return false;
    }
	
	/**
	 * Method that get value of money .
	 * @return the value of money .
	 */
	public double getValue( ) { 
    	return this.value ;
    } 
	
	/**
	 * Method that get currency of money .
	 * @return the currency of money .
	 */
	public String getCurrency() { 
    	return this.currency ;
    }
}
