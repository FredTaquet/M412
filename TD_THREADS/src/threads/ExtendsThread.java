package threads;

// http://stackoverflow.com/questions/541487/implements-runnable-vs-extends-thread
// Extend Thread class...
class ExtendsThread extends Thread {

	private int counter = 0;

	@Override
	public void run() {
		counter++;
		System.out.println("ExtendsThread : Counter : " + counter);
	}
}
