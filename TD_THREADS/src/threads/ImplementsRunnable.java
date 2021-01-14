package threads;

// http://stackoverflow.com/questions/541487/implements-runnable-vs-extends-thread
//Implement Runnable Interface...
public class ImplementsRunnable implements Runnable {

	private int counter = 0;

	public void run() {
		//public synchronized void run() {
		counter++;
		System.out.println("ImplementsRunnable : Counter : " + counter);
	}
}
