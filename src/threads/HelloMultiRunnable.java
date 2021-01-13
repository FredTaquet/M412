package threads;

/*
 * 
 */

public class HelloMultiRunnable implements Runnable {
	private String name;

	public HelloMultiRunnable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("Hello from thread " + Thread.currentThread().getName() + " aka " + name);
		}
	}

	public static void main(String args[]) {

		(new Thread(new HelloMultiRunnable("A"))).start();
		(new Thread(new HelloMultiRunnable("B"))).start();
		(new Thread(new HelloMultiRunnable("C"))).start();
		(new Thread(new HelloMultiRunnable("D"))).start();

		HelloMultiRunnable h = new HelloMultiRunnable("E");
		Thread t = new Thread(h);
		t.start();
		Thread t2 = new Thread(h);
		t2.start();
	}

}