package streamprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * find length of every element in list and push length to another list
 */
public class UseMapMethod1 {

	public static void main(String[] args) {
		List<String> vehicle =Arrays.asList("bus","car","bicycle","flight","train");
		List<String> findLength = new ArrayList<String>();

		/*	//Before java8 without using Streams
		for(String name : vehicle) {
			System.out.println(name.length());
		}*/
		// use of Stream map method
		
	 vehicle.stream().map(name->name.length()).forEach(vname->System.out.println(vname));
	                         //OR
	 vehicle.stream().map(name->name.length()).forEach(System.out::println);
		
	}

}
