package StringMethodProgram;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		String str[] = { "Scaler", "by", "InterviewBit!" };
		String str1 = ConvertToArrayString(str);
		System.out.println("Convert Array To String:" + " " + str1);
	}

	private static String ConvertToArrayString(String[] str) {

		return Arrays.toString(str);

	}

}
