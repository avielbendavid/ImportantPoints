package threads;

public class App {
public static void main(String[] args) {

	MyThread t1 = new MyThread();
	MyThread t2 = new MyThread();
	t1.start();
	t1.setName("t1");
	t2.start();
	t2.setName("t2");
	
	System.out.println("main ended");
}
}
