package StringMethodProgram;

import java.util.Scanner;

public class RemoveCharcter {
	public static String removeCharacter(String str, char ch) {
		String result = str.replace("a", "");
		return result;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "AmoDChaudharI";
		//System.out.println("Enter the Char you want to remove");
		//char ch = sc.next().charAt(0);
		char ch = 'a';
		String result = removeCharacter(str1, ch );
		 System.out.println("After removing character '" + ch + "' from the inputString '" + str1
	                + "' the result will be: \n" + result);
		 System.out.println("String after removing  all Capital letters = "+str1.replaceAll("([A-Z])", ""));
		 System.out.println("String after removing First 'a' = "+str1.replaceFirst("a", ""));
	}
}
