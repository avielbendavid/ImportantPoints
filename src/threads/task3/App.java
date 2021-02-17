package threads.task3;

public class App {

	public static void main(String[] args) {
		Car car = new Car(101);
		CarDriverThread dani = new CarDriverThread(car, 3, 50, "dani");
		CarDriverThread lea = new CarDriverThread(car, 2, 70, "lea");

		dani.start();
		lea.start();

	}

}
