package threads.task2;

// we will create only one instance of this class
public class RequestHandler implements Runnable {

	private int requestId;

	/**
	 * 
	 * this is a synchronized method
	 *
	 *
	 * it is synchronized on the reference "this"
	 *
	 * 
	 * it means that threads that want to enter this method (run it) 
	 * must have the key (only one) for "this "
	 * 
	 * in JAVA every object has a key called - monitor(unique)
	 * 1 person - 1 monitor
	 * 3 persons - 3 monitors
	 * every object has 1 monitor
	 *  
	 * when we enter to the critical section of an object:
	 *  we should present the key(monitor)
	 *  
	 *  *** the monitor has another name - lock flag ***
	 *
	 */
	@Override
	public synchronized void run() {
		requestId++;
		Thread t = Thread.currentThread();
		System.out.println("hello " + t.getName() + " request id : " + requestId + " please wait");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thank you " + t.getName() + " your request id : " + requestId + " was recieved");

	}

}
