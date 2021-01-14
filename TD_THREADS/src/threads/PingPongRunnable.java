package threads;

public class PingPongRunnable extends Thread implements Runnable {

	private String nom;
	int nb;
	
	public PingPongRunnable(String name, int number) {
		this.nom = name;
		this.nb = number;
	}
	
	public void run() {
		for (int i = 0; i < this.nb; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + this.nom + " !");
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

	public static void main(String args[]) {
		
		//new PingPongThread("threadOne", 4).start();
		
		(new Thread(new PingPongRunnable("ping", 4))).start();
		(new Thread(new PingPongRunnable("pong", 4))).start();
	}

}