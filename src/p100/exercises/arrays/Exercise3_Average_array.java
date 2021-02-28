package p100.exercises.arrays;

public class Exercise3_Average_array {

	public static void main(String[] args) {
		int[] arr1 = { 5, 7, 5, 89, 14, 222, 1452148, 587, 45, 362 };
		int[] arr2 = { 3, 3, 9 };
		int total1 = 0;
		int total2 = 0;
		for (int i = 0; i < arr1.length; i++) {
			total1 += arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			total2 += arr2[i];
		}
		System.out.println(total1);
		System.out.println(total2);
	}

}
