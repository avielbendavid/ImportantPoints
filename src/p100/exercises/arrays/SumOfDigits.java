package p100.exercises.arrays;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("Hi User ! \nplease enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int result = 0;
		while (num > 0) {
			result += num % 10;
			num /= 10;
		}
		System.out.println("sum of digits : " + result);
		sc.close();
	}
}
