package threads;

public class LockCounter {
	private int c = 0;
	private final Object lock = new Object();
	
	public void increment() {
		synchronized(lock) {
			c++;
		}
	}

	public void decrement() {
		synchronized(lock) {
			c--;
		}
	}
	
	public int value() {
		synchronized(lock) {
			return c;
		}
	}
}
