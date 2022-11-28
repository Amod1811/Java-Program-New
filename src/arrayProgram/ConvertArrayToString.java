package arrayProgram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertArrayToString {
	public static void main(String[] args) {
		 String []  strArr= {"My", "Name","is","Amod"}; 
	        //USing to-String method convert Array to String
		 String string1 = ConvertArrayToStringUsingToString(strArr);
		 System.out.println("Convert Array To String Using To String"+" "+string1);
		  System.out.println("----------------------------------------------------------------");
		 //Using Append method convert Array to String
		 String string2 = ConvertArrayToStringUsingAppend(strArr);
		 System.out.println("Using Append method convert Array to String" + " "+string2);
		 
		 //using join Method convert Array To String
		 System.out.println("-------------------------------------------------------------------");
		 String string3 =ConvertArrayToStringUsingJoin(strArr);
		 System.out.println("using join Method convert Array To String"+" "+string3);
		 
		//using joining Method convert Array To String
		 System.out.println("--------------------------------------");
		 String string4 = ConvertArrayToStringUsingJoning(strArr);
		 System.out.println("using joining Method convert Array To String"+" "+string4);
	}

	private static String ConvertArrayToStringUsingToString(String[] strArr) {
		
		return strArr.toString();
	}

	private static String ConvertArrayToStringUsingAppend(String[] strArr) {
		StringBuilder strBuilder = new StringBuilder();
		for(int i = 0; i < strArr.length;i++) {
			strBuilder.append(strArr[i]);
		}
		return strBuilder.toString();
	}

	private static String ConvertArrayToStringUsingJoin(String[] strArr) {
		String str = String.join(" ", strArr);
		return str;
	}

	private static String ConvertArrayToStringUsingJoning(String[] strArr) {
		String str = Arrays.stream(strArr).collect(Collectors.joining());
		return str;
	}
}
