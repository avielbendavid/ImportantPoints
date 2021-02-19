package p1.casting;

public class ObjectCasting {
	public static void main(String[] args) {

		// casting on object reference :

		RaceCar raceCar = new RaceCar();

		System.out.println(raceCar.number);
		System.out.println(raceCar.speed);
		System.out.println(raceCar.turboOn);

		// up cast from RaceCar to Car (implicit)
		Car car = raceCar;
		System.out.println(car.number);
		System.out.println(car.speed);

		// System.out.println(car.turboOn); // this member is not in the reference
		// interface

		// down cast from Car to RaceCar (explicit) - we get access to more members of
		// the object
		if (car instanceof RaceCar) {
			RaceCar raceCar2 = (RaceCar) car;
			System.out.println(raceCar2.number);
			System.out.println(raceCar2.speed);
			System.out.println(raceCar2.turboOn);
		}

		Car car2 = new Car();
		RaceCar x = (RaceCar) car2; // will fail at runtime
		System.out.println(x);
	}

	 // *********************************** In conclusion:
	 // ***********************************
	 // objects - the casting is only on the reference -
	 // once object is created is can not change to other type of object

	 // DownCasting - the reason for DownCasting is to reveal more detailed members
	 // actually we get access to more members
     // *************************************************************************************//
     // access modifiers:
	 /*
	 * 1. public - everyone
	 * 
	 * 2. protected - package + subclasses (even if outside the package)
	 * 
	 * 3. default (when not specifying an access modifier) - package private
	 * 
	 * 4. private - only from within the class
	 */
     // *************************************************************************************//

	private static class Car {
		int number;
		int speed;
	}

	private static class RaceCar extends Car {
		boolean turboOn;
	}
}
