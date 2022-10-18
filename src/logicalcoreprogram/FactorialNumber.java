package logicalcoreprogram;

import java.util.Scanner;

public class FactorialNumber {

	public static void printfactorial(int n) {
		if (n < 0) {
			System.out.println("Number is invalid");
			return;
		}
		int factorial = 1;
		for (int i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		printfactorial(n);
	}

}
