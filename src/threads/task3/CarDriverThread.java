package threads.task3;

public class CarDriverThread extends Thread {

	private Car car;
	private int travelDistance;
	private int travelSpeed;

	public CarDriverThread(Car car, int travelDistance, int travelSpeed, String driverName) {
		super(driverName);
		this.car = car;
		this.travelDistance = travelDistance;
		this.travelSpeed = travelSpeed;
	}

	@Override
	public void run() {
		// we want to synchronize this critical section - so we will get the car's
		// monitor - and therefore until the thread will not release the monitor no one
		// of the thread will enter this critical section
		synchronized (car) {
			this.car.turnOn();
			this.car.drive(travelDistance, travelSpeed);
			this.car.turnOff();
		}
	}
}
