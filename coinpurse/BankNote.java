package coinpurse;

/**
* bank note is represented to money with fixed value and currency
* @author Poorin Pichayamongkol.  
*/
public class BankNote extends AbstractValuable implements Comparable{
	private static long nextSerialNumber = 1000000;
	private long serialNumber;
	public static final String DEFAULT_CURRENCY = "Baht";
	
	/**
     * A constructor initialize with given value using the default currency.
     * @param value is value of the bank notes.
     */
	public BankNote(double value){
		super(value ,DEFAULT_CURRENCY);
	}
	
	/**
     * A constructor initialize with given value and currency.
     * @param value is the value of bank notes.
     * @param currency is currency of bank notes that was given.
     */
	public BankNote(double value, String currency , long serialNumber){
		super(value , currency);
		this.serialNumber = nextSerialNumber ;
	}
	
	/**
	 * Method that return serial number of each bank note.
	 * @return serial number of bank note.
	 */
	public long getSerial(){
		return this.serialNumber;
	}
	
	/**
	 * return the description of this Banknote class in String.
	 * @return the String that describe the Banknote class.
	 */
	public String toString(){
		return super.value+""+"-"+super.currency+" note ["+this.getSerial()+"]";
	}
}
