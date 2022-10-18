import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class PracticeProgram {
	
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = Sc.next();
		StringBuilder sbl = new StringBuilder();
		StringBuilder sb = sbl.reverse();
		if(str.equals(sb)) {
			System.out.println(sbl + "String is palindrome");
		}else {
			System.out.println(sbl +"String is Not Palindrome");
		}
	}
}
