package threads.task3;

public class Car {

	private int number;
	private int km;
	private int speed;
	private boolean engineOn;

	public Car(int number) {
		super();
		this.number = number;
	}

	public void turnOn() {
		Thread carDriver = Thread.currentThread();
		if (!engineOn) {
			engineOn = true;
			System.out.println(carDriver.getName() + " turned on car " + this.number);
		} else {
			System.out.println("sorry , " + carDriver.getName() + " car " + this.number + " is already started");
		}

	}

	public void turnOff() {
		Thread carDriver = Thread.currentThread();
		if (engineOn) {
			engineOn = false;
			System.out.println(carDriver.getName() + " turned off car " + this.number);
		} else {
			System.out.println("sorry , " + carDriver.getName() + " car " + this.number + " is already turned off");
		}
	}

	public void drive(int distance, int speed) {
		Thread carDriver = Thread.currentThread();
		if (this.engineOn) {
			this.speed = speed;
			System.out.println(carDriver.getName() + " started drive at " + km + " km, current speed is : " + this.speed);
			try {
				Thread.sleep(distance * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.km += distance;
			this.speed = 0;
			System.out.println(carDriver.getName() + " finished drive at " + km + " km, current speed is : " + this.speed);
		} else {
			System.out.println("Sorry ," + carDriver.getName() + " car " + this.number + " is turned off");
		}
	}

	public int getNumber() {
		return number;
	}

	public int getKm() {
		return km;
	}

	public int getSpeed() {
		return speed;
	}

	public boolean isEngineOn() {
		return engineOn;
	}

	public static void main(String[] args) {
		
		// This main method is just for test
		
		Car car = new Car(111);
		car.turnOn();
		car.drive(3, 100);
		car.turnOff();
		
		car.turnOn();
		car.drive(2, 56);
		car.turnOff();
		
	}
}
