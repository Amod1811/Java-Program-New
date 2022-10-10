package logicalcoreprogram;

import java.util.Scanner;

public class GreaterThreeNumber1 {
	public void greaterNumber() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	if(num1 > num2 && num1 > num3) {
		System.out.println("Greater Number is :" + num1);
	}
	else if(num2 > num1 && num2 > num3) {
		System.out.println("Greater Number is  :" + num2);
	}
	else {
		System.out.println("Greater Number is:" + num3);
	}
}
	public static void main(String[] args) {
		GreaterThreeNumber1 greaterThreeNumber1 = new GreaterThreeNumber1();
		greaterThreeNumber1.greaterNumber();

	}

}
