package bl.com.exceptionhandling;

import java.io.FileInputStream;

public class DemoException {

	public static void main(String[] args) {
		try
		{
		int a= 100 ,b=0,c;
		c= a/b;
		System.out.println(c);
		}catch(Exception e)
		{
			System.out.println(e + " "+"you canot divided by zero");
		
		}
		System.out.println("Hello");
	}

}
