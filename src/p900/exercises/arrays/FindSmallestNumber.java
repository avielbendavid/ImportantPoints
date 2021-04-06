package p900.exercises.arrays;

import java.util.Scanner;

public class FindSmallestNumber {
	public static void main(String[] args) {


		System.out.println("Hello User!!!");
		
		Scanner in = new Scanner(System.in);
		int[] arrNumbersFromUsers = new int[3];
		for (int i = 0; i < arrNumbersFromUsers.length; i++) {
			System.out.println("please enter a number : ");
			int number = in.nextInt();
			arrNumbersFromUsers[i]=number;
		}

		int min=arrNumbersFromUsers[0];
		
		for (int i = 0; i < arrNumbersFromUsers.length; i++) {
			if(arrNumbersFromUsers[i]<min) {
				min=arrNumbersFromUsers[i];
			}
		}
		System.out.println("Minimum number is : "+min);
		in.close();
	}
}
