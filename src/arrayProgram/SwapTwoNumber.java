package arrayProgram;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping the Number :" + a + " " + b);
		// Logic 1 Use Third Variable 
		/*
		int t = a;
		a = b;
		b = t;*/
		
		//Logic 2 without third variable
		
		/*a = a+b;
		b = a-b;
		a = a-b;*/
		
		//Logic 3 without third variable and use divsion and multiplication
		
		/*a = a*b;
		b = a/b;
		a = a/b;*/
		
		// Logic 4 use xoR oprator
		
		/*a = a^b;
		b = a^b;
		a = a^b;*/
		
		// Logic 5 single statement
		
		b = a+b-(a=b);
		System.out.println("Before Swapping the Number :" + a + " " + b);
	}

}
