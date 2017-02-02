package stopwatch;
/**
 * A Stopwatch that measures elapsed time between a starting time and stopping time, or until the present time.
 * @author Poorin Pichayamongkol
 * @version 27.01.2017
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;
	/** boolean to check the stopwatch running or not running. */
	private boolean runner;
	/** Start the stopwatch if it is not already running. */
	public void start(){
		if (isRunning()==false){
			this.startTime = System.nanoTime();
			this.runner = true ;
		}
	}
	/**
	 * Stop the stopwatch if it already running .
	 */
	public void stop(){
		if (isRunning()==true){
			this.stopTime = System.nanoTime() ;
			this.runner = false ;
		}
	}
	/**
	 * get the elapsed time that stopwatch do and it has 2 cases
	 * 	1. if stopwatch is running it will return the time between this current time and start time. 
	 * 	2. if stopwatch is not running it will return the time between start and stop time.
	 * @return the elapsed time in seconds with decimal.
	 */
	public double getElapsed(){
		if (runner == true){
			return (System.nanoTime() - startTime ) *NANOSECONDS ;
		}
		else{
			return (stopTime-startTime)*NANOSECONDS;
		}
	}
	/**
	 * the boolean method to indicate that stopwatch is running or not.
	 * @return the boolean that stopwatch is still not running or running already.
	 *         true if the stopwatch is running, false if stopwatch is stopped.
	 */
	public boolean isRunning(){
		return this.runner;
	}
}

