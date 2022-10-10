package streamprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseFlatMapMethod {

	public static void main(String[] args) {
		List<String> teamA =Arrays.asList("scott","David","John");
		List<String> teamB =Arrays.asList("mary","cherry","derry");
		List<String> teamC =Arrays.asList("Aary","Jarry","Bharry");
		
		List<List<String>>playerInWorldCup = new ArrayList<List<String>>();
		playerInWorldCup.add(teamA);
		playerInWorldCup.add(teamB);
		playerInWorldCup.add(teamC);
		
		//before java8 or without stream flat method
		/*for(List<String> team:playerInWorldCup ) {
			for(String name:team){
				System.out.println(name);
			}
		}*/
		//Using the stream 
		List<String> name=playerInWorldCup.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		System.out.println(name);
	}

}
