package logicalcoreprogram;

import java.util.Scanner;

public class FunctionExamples {

	/*public static int addNum(int a, int b) {
		int multi = a * b;
		return multi;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int multi =addNum(a,b);
		System.out.println("Multiplication of Two number :" + multi);
}*/
	/*public static int addNum(int a, int b) {
		
		return  a * b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Multiplication of Two number :" + addNum(a,b));
}*/
	public static void printFactorial(int n) {
		if(n < 0) {
			System.out.println("Invalid number");
			return;
		}
		int factorial = 1;
		
		for(int i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		printFactorial(n);
	} 
 }
