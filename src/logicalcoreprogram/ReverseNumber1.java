package logicalcoreprogram;

import java.util.Scanner;

public class ReverseNumber1 {
	
	public static int reverseNum(int num) {
		int rem ;
		int rev = 0;
		while(num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num /10;
		}
		return rev;
	} 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		 int rev =reverseNum(num) ;
		 System.out.println("Reverse number is:" + rev);
		
	}
}
