package stopwatch;

/**
 * The class for sum double,which are primitive, in array only.
 * @author Poorin Pichayamongkol
 *
 */
public class SumDoublePrimitive implements Runnable{
	private int count ;
	static final int ARRAY_SIZE = 100000; 
	double[] values ; 
	
	/**
	 * The constructor that initialize SumDoublePrimitive class by
	 * creating array and wait to get values from count for limit the amount to add double to array.
	 * count is amount of double that were added to array. 
	 * @param count is amount of double that were added to array. 
	 */
	public SumDoublePrimitive(int count){
		this.count = count ;
		values = new double[ARRAY_SIZE];
		for(int k=0; k<ARRAY_SIZE; k++) {
			values[k] = k+1;
		}
	}
	
	/**
	 * Method that perform SumDoublePrimitive Class by adding 
	 * double to array and sum them with loops until it reach 
	 * the limit that user assign with parameter count . 
	 */
	@Override
	public void run() {
		double sum = 0.0;
		for(int c = 0, i = 0; c < count; count++, i++) {
			if (i >= values.length) i = 0;  // reuse the array when get to last value
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
		return String.format("Sum array of double primitives with count=%,d\n", count);
	}
	
}
