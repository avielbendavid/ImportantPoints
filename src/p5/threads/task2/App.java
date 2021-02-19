package p5.threads.task2;

public class App {
	public static void main(String[] args) {
		RequestHandler requestHandler = new RequestHandler();

		Thread ran = new Thread(requestHandler, "Ran");
		Thread dan = new Thread(requestHandler, "Dan");
		Thread aan = new Thread(requestHandler, "Aan");

		ran.start();
		dan.start();
		aan.start();

	}
}
