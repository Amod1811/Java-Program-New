package streamprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchesFunction {

	public static void main(String[] args) {
		List<String>fruits = new ArrayList<String>();
		fruits.add("One Apple");
		fruits.add("One mango");
		fruits.add("TWo Apples");
		fruits.add("More Grapes");
		fruits.add("TWo guavas");
		
		//anymatch()
		boolean result = fruits.stream().anyMatch(value ->{return value.startsWith("One");});
		System.out.println(result);

		//allmatch()
		 result = fruits.stream().allMatch(value ->{return value.startsWith("One");});
		System.out.println(result);
		
		//nonmatch
		 result = fruits.stream().noneMatch(value ->{return value.startsWith("four");});
		System.out.println(result);
	}

}
