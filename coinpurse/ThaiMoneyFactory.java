package coinpurse;

public class ThaiMoneyFactory extends MoneyFactory{
	
	/**
	 * Method for create money in Baht .
	 * @return in Coin class when their value are 1 , 2 , 5 , 10 .
	 * 		   in Banknote class when their value are 20 , 50 , 100 , 500 , 1000 . 
	 */
	public Valuable createMoney(double value){
		if (value == 1 || value == 2 || value == 5 || value == 10){
			return new Coin(value);
		}
		if (value == 20 || value == 50 || value == 100 || value == 500 || value == 1000 ){
			return new BankNote(value);
		}
		else throw new IllegalArgumentException();
	}
}
