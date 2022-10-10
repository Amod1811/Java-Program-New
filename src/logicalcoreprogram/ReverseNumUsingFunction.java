package logicalcoreprogram;

import java.util.Scanner;

public class ReverseNumUsingFunction {
	
	public int  reverseNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int rem ;
		int rev = 0;
		for(;num != 0;) {
			
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num /10;
		}
		return rev;
	}
	public static void main(String[] args) {
		
		
		ReverseNumUsingFunction obj = new ReverseNumUsingFunction();
		System.out.println("Reverse Number is :" + obj.reverseNum());
	}

}


/*6575
rem = 6575 % 10 =5
rev = 0 * 10 + 5 = 5 
num = 6575 / 10 = 657.5 =657

657
rem = 657 % 10 = 7
rev = 5 * 10 + 7 =57
num = 657 / 10 = 65.7 = 65

65 
rem = 65 % 10 = 5
rev = 57 * 10 + 5 = 575
num = 65/ 10 = 6.5 = 6

6 
rem = 6 % 10 = 0.6
rem = 575 * 10 + 6 = 5756
num = 6 / 10 = 0.6 = 0

5756
*/
