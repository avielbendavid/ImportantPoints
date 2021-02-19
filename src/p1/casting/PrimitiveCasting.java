package p1.casting;

public class PrimitiveCasting {

	public static void main(String[] args) {

		// casting is conversion from one type to another

		// casting on a primitive
		double a = 5.3; // represented as double 64 bit

		// cast the double to float
		float b = (float) a; // represented as double 32 bit
		System.out.println(b);
		
		// cast the double to int
		int c = (int) a; // represented as double 32 bit
		System.out.println(c);
		
		char cr1 = 'A';
		System.out.println(cr1);
		int cr1AsInt = cr1; // implicit casting
		System.out.println(cr1AsInt);

	}
}
