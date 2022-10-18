package logicalcoreprogram;

import java.util.Scanner;

public class StringPanlindrome {
	public void palindromeStr(String s) {
	String rev = "";
	for(int i = s.length()-1; i >=0; i--) {
		rev = rev + s.charAt(i);
	}
	if(s.equals(rev)) {
		System.out.println("String is Palindrome");
	}else {
		System.out.println("String is not Palindrome");
	}
	}
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = Sc.next();
		StringPanlindrome obj = new StringPanlindrome();
		obj.palindromeStr(str);
//		StringBuilder sbl = new StringBuilder();
//		StringBuilder sb = sbl.reverse();
//		if (str.equals(sb)) {
//			System.out.println(sbl + "String is palindrome");
//		} else {
//			System.out.println(sbl + "String is Not Palindrome");
//		}
	}
}
