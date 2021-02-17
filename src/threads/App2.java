package threads;

public class App2 {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r, "t1");
		Thread t2 = new Thread(r, "t2");
		t2.setDaemon(true);

		t1.start();
		t2.start();

	}

}
