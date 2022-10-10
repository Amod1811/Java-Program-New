package streamprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * filter the null value in collection
 */
public class UseFilterMethod3 {

	public static void main(String[] args) {
	
		List<String> words =Arrays.asList("Cup",null,"forest","sky","book",null,"theater");
		
		List<String> result = new ArrayList<String>();
		
	result = words.stream().filter(w-> w!= null).collect(Collectors.toList());
		System.out.println(result);
	}

}
