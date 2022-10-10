package logicalcoreprogram;

import java.util.Scanner;

public class EvenOddUsingWhileLoop {
	public void evenNumber() {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		i = 2;
		while( i <= num) {
			
				System.out.println("Even number" + " " + i);
				i = i + 2;
			
		}
		
	}

	public static void main(String[] args) {
		EvenOddUsingWhileLoop obj = new EvenOddUsingWhileLoop();
		obj.evenNumber();
		

	}

}
