package arrayProgram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
//		 int n1 = 10;
//		 int n2 = 11;
		 int sum = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number ");
		 int n1 = sc.nextInt();
		 int n2 = sc.nextInt();
		 for(int i = 2; i < 10; i++) {
			 sum = n1 + n2;
			 System.out.print(" "+ sum);
			 n1 = n2 ;
			 n2 = sum;
		 }

	}

}
