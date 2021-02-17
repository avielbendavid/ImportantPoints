package threads;

public class MyRunnable implements Runnable {

	// extends is still available - in this technique -
	// not like the other technique :
	// (class that extends from 'Thread' class - extends is not available)

	@Override
	public void run() {

		// In order to invoke Thread instance methods we need a reference
		// to the currently executing thread object.
		Thread currentThread = Thread.currentThread();

		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread.getName() + " - " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
