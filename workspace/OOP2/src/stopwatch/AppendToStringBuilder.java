package stopwatch;

/**
 * The Class for appends chars to String by using StringBuilder() only .
 * @author Poorin Pichayamongkol
 *
 */
public class AppendToStringBuilder implements Runnable{
	private int count ;
	final char CHAR = 'a';
	
	/**
	 * The constructor that initialize the AppendToStringBuilder Class with count.
	 * And count is the length of String that this class can appends. 
	 * @param count is the length of String that this class can appends. 
	 */
	public AppendToStringBuilder(int count){
		this.count = count ;
	}
	
	/**
	 * Method that perform this class by appends chars to String by using StringBuilder()
	 * with loops until it reach the limit that user assign as parameter count.
	 */
	@Override
	public void run() {
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		String result = builder.toString();
		System.out.println("final string length = " + result.length());
	}
	
	/**
	 * Method that describes the task .
	 * @return describes the task.
	 */
	@Override 
	public String toString(){
		return String.format("Append %,d chars to StringBuilder\n", count);
	}
}
