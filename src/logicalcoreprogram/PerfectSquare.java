package logicalcoreprogram;

import java.util.Scanner;

public class PerfectSquare {

	public void  perfectSquare() {
		double i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
			i = Math.sqrt(num);
			if(num == i * i ) {
				System.out.println("Number is perfect Square");
			}
			else {
				System.out.println("Number is not perfect Square");
			}
		}
	public static void main(String[] args) {
		PerfectSquare obj = new PerfectSquare();
		obj.perfectSquare();


	}

}
