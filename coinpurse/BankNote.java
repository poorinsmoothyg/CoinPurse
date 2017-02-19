package coinpurse;

/**
* bank note is represented to money with fixed value and currency
* @author Poorin Pichayamongkol.  
*/
public class BankNote implements Comparable<BankNote>, Valuable{
	private double value;
	private String currency;
	private static long nextSerialNumber = 1000000;
	private long serialNumber;
	public static final String DEFAULT_CURRENCY = "Baht";
	
	/**
     * A constructor initialize with given value using the default currency.
     * @param value is value of the bank notes.
     */
	public BankNote(double value){
		this.value = value;
		this.currency = DEFAULT_CURRENCY;
	}
	
	/**
     * A constructor initialize with given value and currency.
     * @param value is the value of bank notes.
     * @param currency is currency of bank notes that was given.
     */
	public BankNote(double value, String currency){
		this.value = value;
		this.currency = currency;
	}
	
	/**
	 * Method that return value of bank note.
	 * @return value of bank note.
	 */
	public double getValue(){
		return this.value;
	}
	
	/**
	 * Method that return currency of bank note.
	 * @return currency of banknote.
	 */
	public String getCurrency(){
		return this.currency;
	}
	
	/**
	 * Method that return serial number of each bank note.
	 * @return serial number of bank note.
	 */
	public long getSerial(){
		return this.serialNumber;
	}
	
	/**
	 * Method that check the value of bank note with other bank note.
	 * @param obj the bank note that need to compare.
	 * @return true if the value of bank note is equal.
	 * 		   false if the value of bank note is not equal.
	 */
	public boolean equals(Object obj) {
    	if (obj==null)return false;
    	if (obj.getClass()!=this.getClass())return false;
    	BankNote other = (BankNote) obj;
    	if (value == other.value)return true;
    	return false;
    }
	
	/**
	 * return the description of this Banknote class in String.
	 * @return the String that describe the Banknote class.
	 */
	public String toString(){
		return this.value+""+"-"+this.currency+" note ["+this.serialNumber+"]";
	}
	
	/**
	 * Method that compare the value of bank notes and return 1 if value is greater,
	 * 0 if value is equal,-1 if value is less. 
	 * @param c is the value of coin that need to compare to.
	 * @return 1 if value is greater.
	 * 		   0 if value is equal.
	 * 		   -1 if value is less. 
	 */
	public int compareTo(BankNote bn){
		if(bn == null)return -1;
    	if(this.value > bn.value)return 1;
    	else if(this.value < bn.value)return -1;
    	else return 0;
    }
}
