package logicalcoreprogram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0;
		while (num != 0) { // number is not equal to zero enter in the loop
			rev = rev * 10 + num % 10;// 1.>0*10 + 1234%10 = 0 + 4 =4 | 4*10+123%10= 40 + 3 = 43 |43 * 10 + 12%10 = 430+2 =432 | 432 *10+1%1=4320+1= 4321
			num = num / 10;// 1.>1234/10 = 123 | 123/ 10 = 12 | 12/10 = 1 | 1 /10 = 0
		}
		if (org_num == rev) { //1234 = 1234 = true
			System.out.println("The Number is palindrome");
		} else {
			System.out.println("The Number is not palindrome");
		}
	}
}
