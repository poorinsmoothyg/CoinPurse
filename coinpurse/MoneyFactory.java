package coinpurse;

/**
 * MoneyFactory class is class for creating money in any currency 
 * that we assign .
 * @author Poorin Pichayamongkol
 *
 */
abstract class MoneyFactory {
	private static MoneyFactory instance ;
	
	/**
	 * Constructor that initialize for abstract class.
	 */
	protected MoneyFactory(){
		
	}
	
	/**
	 * Method for create money factory that is only one factory and have fixed currency .
	 * @return money factory that have one currency .
	 */
	public static MoneyFactory getInstance(){
		return instance;
	} 
	
	/**
	 * Abstract method to create money when assign the double value 
	 * @param value is the value of money. 
	 * @return value of money that depends on currency of each money factory .
	 */
	public abstract Valuable createMoney(double value);
	
	/**
	 * Method to create money when assign the String value and parse it to double .
	 * @param value is the value of money. 
	 * @return value of money that depends on currency of each money factory .
	 */
	public Valuable createMoney(String value){
		return createMoney(Double.parseDouble(value));
	}
	
	/**
	 * Methods that create money with currency that we assign .
	 * @param currency is the currency of money that this method make .
	 */
	public static void setMoneyFactory(String currency) {
		if (currency.equalsIgnoreCase("Thai")) {
			instance = new ThaiMoneyFactory() ;
		}
		else if (currency.equalsIgnoreCase("malay")) {
			instance = new MalayMoneyFactory() ;
		}
	}
}
