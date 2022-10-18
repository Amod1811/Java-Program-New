package logicalcoreprogram;

import java.util.Scanner;

public class AverageOfNumber {

	public static void main(String[] args) {
		int num;
		double res = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many To Calculate Avg");
		num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter" + num + " Numbers");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			res = res + arr[i];
		}
		System.out.println("Average = " + res / num);
	}
}
