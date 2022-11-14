package arrayProgram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
//		 int n1 = 0;
//		 int n2 = 1;
		 int sum = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number ");
		 int n1 = sc.nextInt();
		 int n2 = sc.nextInt();
		 for(int i = 2; i < 10; i++) {//start index number two bcz already take two value
			 sum = n1 + n2;// 0+1 = 1
			 System.out.print(" "+ sum);// sum = 1 and interchange the number n1 value and sum value perform following opration
			 n1 = n2 ;// n2 value give to n1 means = n1= 1
			 n2 = sum;// sum value give to n2 means = n2 value and loop executed again
		 }

	}

}
