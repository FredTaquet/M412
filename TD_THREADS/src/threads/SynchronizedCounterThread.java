package threads;

public class SynchronizedCounterThread implements Runnable{
	private SynchronizedCounter count;
	private int n;

	public SynchronizedCounterThread(SynchronizedCounter counter, int nb) {
		this.count = counter;
		this.n = nb;
	}
	
	public void run() {
		for (int i = 0; i < n; i++) {
			count.increment();
		}
		
	}
	

}
