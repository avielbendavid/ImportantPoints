package threads;

public class App3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Thread has several states that represented in ENUM : [Thread.State]
		
		MyThread t1 = new MyThread("t1");
		// tHE TREAD IS CREATED [STATE : NEW]
		System.out.println(t1.getState());
		t1.start();
		// tHE TREAD IS START [STATE : RUNNABLE]
		System.out.println(t1.getState());

		Thread.sleep(300);
		// tHE TREAD IS SLEEP [STATE : TIMED_WAITING]
		System.out.println(t1.getState());
		
		t1.join();
		// tHE TREAD IS TERMINATED [STATE : TERMINATED]
		// AFTER THREAD IS TERMINATED - WE CAN NOT START THE THREAD AGAIN!
		System.out.println(t1.getState());
	}
	
}
