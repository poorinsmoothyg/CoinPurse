package coinpurse;

/**
 * Malay Money Factory for create money in currency in Malaysia .
 * @author Poorin Pichayamongkol 
 */
public class MalayMoneyFactory extends MoneyFactory{
	private static long nextSerialNumber = 1000000;
	
	/**
	 * Method for create money in Ringgit and sen .
	 * @return in Coin class when their value are 0.05 , 0.10 , 0.20 , 0.50.
	 * 		   in Banknote class when their value are 1 , 2 , 5 , 10 , 20 , 50 , 100 . 
	 */
	public Valuable createMoney(double value){
		if (value == 0.05 || value == 0.10 || value == 0.20 || value == 0.50){
			return new Coin(value, " Sen");
		}
		if (value == 1 || value == 2 || value == 5 || value == 10 || value == 20 || value == 50 || value == 100){
			return new BankNote(value, " Ringgit" , nextSerialNumber++ );
		}
		else throw new IllegalArgumentException();
	}
}
