package stopwatch;

/**
 * Class for running the tasks with Stopwatch to measure the time that the computer use to 
 * do each tasks.
 * @author Poorin Pichayamiongkol
 *
 */
public class TaskTimer {
	
	private Stopwatch watch;
	
	/**
	 * Constructor that initialize the Stopwatch.
	 */
	public TaskTimer(){
		this.watch = new Stopwatch() ;
	}
	
	/**
	 * The method that is the orders that this Class need to do 
	 * for each tasks if it call TaskTimer. 
	 * @param runnable is the tasks that user want to run .
	 */
	public void measureAndPrint(Runnable runnable){
		System.out.print(runnable.toString());
		watch.start();
		runnable.run();
		watch.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", watch.getElapsed());	
	}
}
