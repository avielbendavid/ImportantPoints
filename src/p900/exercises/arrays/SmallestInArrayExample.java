package p900.exercises.arrays;

public class SmallestInArrayExample {
	public static void main(String[] args) {
		int[] arr = { 5, 445, 71, 54, 47, 457, 1254, 478885, 1 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[0]);
	}

}
