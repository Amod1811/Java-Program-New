package logicalcoreprogram;

import java.util.Scanner;

public class CharFrequency {
	public void checkOccurance(String userstring, char ch) {
	int count = 0;
	for(int i = 0;i<userstring.length();i++)
	{
		if (userstring.charAt(i) == ch) {
			count++;
		}
	}
	System.out.println("Occurance of Character is: "+count);
	}
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a String: ");
	        String string = sc.next().toLowerCase();
	        System.out.println("Enter a Character: ");
	        char ch = sc.next().charAt(0);

	        CharFrequency sample = new CharFrequency();
	        sample.checkOccurance(string, ch);
	
	    

}

}
