package stopwatch;

/**
 * Class for appends chars to String only.
 * @author Poorin Pichayamongkol
 *
 */
public class AppendToString implements Runnable{
	private int count;
	final char CHAR = 'a';
	
	/**
	 * Constructor AppendsToString that initialize with count.And count is the length of String that this class can appends. 
	 * @param count is the length of String that this class can appends. 
	 */
	public AppendToString(int count){
		this.count = count ;
	}
	
	/**
	 * Method for run by interface run and this is the way that this class do.
	 * To appends chars to String with loops until it reach count or length that 
	 * user assign . 
	 */
	@Override
	public void run() {
		String result = ""; 
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}
	
	/**
	 * Method that describes the task .
	 * @return describes the task .
	 */
	@Override 
	public String toString(){
		return String.format("Append %,d chars to String\n", count);
	}
	
}
