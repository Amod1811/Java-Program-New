package logicalcoreprogram;

import java.util.Scanner;

public class SumOfPrimeNumber {
	
	public void sumPrime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num  = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <=num; i = i+2) {
			sum = sum+ i;
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		SumOfPrimeNumber obj = new SumOfPrimeNumber();
		obj.sumPrime();

	}

}
