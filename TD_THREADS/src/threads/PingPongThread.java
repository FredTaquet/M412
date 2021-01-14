package threads;

public class PingPongThread extends Thread {

	private String nom;
	int nb;
	
	public PingPongThread(String name, int number) {
		this.nom = name;
		this.nb = number;
	}
	
	public void run() {
		for (int i = 0; i < this.nb; i++) {
			System.out.println(this.nom);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

	public static void main(String args[]) {
		
		//new PingPongThread("threadOne", 4).start();
		
		(new PingPongThread("ping", 4)).start();
		(new PingPongThread("pong", 4)).start();
	}
}