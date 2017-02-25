package coinpurse;

/**
* coin is represented to money with fixed value and currency
* @author Poorin Pichayamongkol.  
*/
public class Coin extends AbstractValuable implements Comparable {
	public static final String DEFAULT_CURRENCY = "Baht";
    /**
     * A constructor initialize with given value using the default currency.
     * @param value is value of the coins.
     */
    public Coin( double value ) {
        super(value , DEFAULT_CURRENCY);
    }
    
    /**
     * A constructor initialize with given value and currency.
     * @param value is the value of coins.
     * @param currency is currency of coin that was given.
     */
    public Coin( double value, String currency ) {
    	super(value , currency);
    }
    
    /**
     * return the description of this Coin class in String.
     * @return the String that describe the Coin class.
     */
    public String toString() { 
    	return super.getValue()+"-"+super.currency; 
    }  
}


