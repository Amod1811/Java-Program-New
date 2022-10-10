package arrayProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		 //Logic 1 using Algoritm
		int num = sc.nextInt();
		//int rev = 0;
		/*while(num != 0) {
			rev = rev * 10 +  num%10;
			num = num /10;
		}
		System.out.println("Reverse Number is" + rev);*/
		
		 //Logic 2 Using StringBuffer
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		 StringBuffer rev = sb.reverse();
		System.out.println("Reverse Number is" + rev);*/
		
		//using logic3 Using StringBulider
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("Reverse Number is" + rev);
	}

}
