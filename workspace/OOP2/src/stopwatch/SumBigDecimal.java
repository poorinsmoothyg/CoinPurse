package stopwatch;

import java.math.BigDecimal;

/**
 * The Class for sum BigDecimal,which are objects, in array only .
 * @author Poorin Pichayamongkol
 *
 */
public class SumBigDecimal implements Runnable{
	static final int ARRAY_SIZE = 1000000;
	private int count ;
	BigDecimal[] values ; 
	
	/**
	 * The constructor that initialize SumBigDecimal by 
	 * creating array and wait to get values from count for limit the amount to add BigDecimal objects to array.
	 * And count is the amount of BigDecimal objects that were added to array.
	 * @param count is the amount of BigDecimal objects that were added to array.
	 */
	public SumBigDecimal(int count){
		this.count = count ;
		values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) {
			values[i] = new BigDecimal(i+1);
		}
	}
	
	/**
	 * Method that perform this Class by adding BigDecimal objects to array
	 * with loops and sum the values of them until it reach the limit 
	 * that user assign as parameter count .
	 */
	@Override
	public void run(){
		BigDecimal sum = new BigDecimal(0.0);
		for(int c=0, i=0; c<count; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
		System.out.println("sum = " + sum);
	}
	
	/**
	 * Method that describes the task.
	 * @return describes the task.
	 */
	@Override
	public String toString(){
		return String.format("Sum array of BigDecimal with count=%,d\n", count);
	}
}
