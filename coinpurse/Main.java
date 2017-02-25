package coinpurse;

import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * A main class to create objects and connect objects together.
 * The user interface needs a reference to coin purse.
 * @author Poorin Pichayamongkol.
 */
public class Main {
	private static int CAPACITY = 10 ;
	
	/**
     * Configure and start the application.
     * @param args not used
     */
    public static void main( String[] args ) {
//    	ResourceBundle bundle = ResourceBundle.getBundle( "purse" );
//		String factoryclass = bundle.getString( "moneyfactory" );
//		MoneyFactory instance = null;
//		try {
//			instance = ( MoneyFactory )Class.forName( factoryclass ).newInstance();
//		}
//		catch ( ClassCastException cce ) {
//			System.out.println( factoryclass + " is not type MoneyFactory" );
//		}
//		catch (Exception ex) {
//			System.out.println( "Error creating MoneyFactory " + ex.getMessage() );
//		}
//		if ( instance == null ) System.exit(1);

		Scanner sc = new Scanner(System.in) ;
    	System.out.print("Enter currency : ");
    	String currency = sc.nextLine() ;
    	MoneyFactory.setMoneyFactory(currency);
    	Purse purse = new Purse(CAPACITY);
    	ConsoleDialog ui = new ConsoleDialog(purse);
    	ui.run();    	 
    }
}
