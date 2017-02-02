package stopwatch;

/**
 * The Class for sum Double,which are objects, in array only .
 * @author Poorin Pichayamongkol  
 * 
 */
public class SumDouble implements Runnable{
	Double[] values ;
	private int count ;
	static final int ARRAY_SIZE = 100000; 
	
	/**
	 * The constructor that initialize SumDouble by 
	 * creating array and wait to get values from count for limit the amount to add double to array.
	 * And count is the amount of Double objects that were added to array.
	 * @param count is the amount of Double objects that were added to array.
	 */
	public SumDouble(int count){
		values = new Double[ARRAY_SIZE];
		this.count = count ;
		for(int i=0; i<ARRAY_SIZE; i++) {
			values[i] = new Double(i+1);
		}
	}
	
	/**
	 * Method that perform this Class by adding Double objects to array
	 * with loops and sum the values of them until it reach the limit 
	 * that user assign as parameter count .
	 */
	@Override
	public void run(){
		Double sum = new Double(0.0);
		for(int c=0, i=0; c<count; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}
	
	/**
	 * Method that describes the task.
	 * @return describes the task.
	 */
	@Override
	public String toString(){
		return String.format("Sum array of Double objects with count=%,d\n", count);
	}
}
