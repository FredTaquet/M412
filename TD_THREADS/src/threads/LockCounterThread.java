package threads;

public class LockCounterThread implements Runnable {
	
    private LockCounter count;
	private int nInc;
	private int nDec;

	public LockCounterThread(LockCounter count, int nInc, int nDec) {
		this.count = count;
		this.nInc = nInc;
		this.nDec = nDec;
	}

	public void run() {
		for (int i = 0; i < nInc; i++) {
			count.increment();
		}
		for (int j = 0; j < nDec; j++) {
			count.decrement();
		}
	}

	public static void main(String args[]) throws InterruptedException {
		LockCounter count = new LockCounter();
		System.out.println("Initial value for count: "+ count.value());
		LockCounterThread lct1=new LockCounterThread(count, 10000,5000);
		Thread t1=new Thread(lct1);
		LockCounterThread lct2=new LockCounterThread(count, 5000, 10000);
		Thread t2 = new Thread(lct2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final value for count: " + count.value());
	}
}
