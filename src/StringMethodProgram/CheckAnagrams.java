package StringMethodProgram;

import java.util.Arrays;

public class CheckAnagrams {
	public static boolean isAnagram(String firsString, String secondString) {
		char[] firstStringCharArray = firsString.toLowerCase().toCharArray();
		char[] secondStringCharArray = secondString.toLowerCase().toCharArray();
		Arrays.sort(firstStringCharArray);
		Arrays.sort(secondStringCharArray);
		return Arrays.equals(firstStringCharArray, secondStringCharArray);

	}

	public static void main(String[] args) {
		String firstString = "Army";
		String secondString = "mary";
		System.out.println("Check if the firstString and secondString is anagram of each other:"
				+ isAnagram(firstString, secondString));

	}

}
