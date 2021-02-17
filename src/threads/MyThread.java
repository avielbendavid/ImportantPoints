package threads;

public class MyThread extends Thread {

	// ADVANTAGES : we have access to all Thread methods
	// DISADVANTAGES : extends is NOT available anymore

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + " - " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
