package arraylistprogram;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String [] arr = {"Amod", "Shushant", "Mayur","Nikhil"};
		
		List al = Arrays.asList(arr);
		
		System.out.println(al);

	}

}
