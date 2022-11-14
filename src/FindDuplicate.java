import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
// find the duplicate element in list using stream API
public class FindDuplicate {

	public static void main(String[] args) {
	List<Integer>list = Arrays.asList(10,15,5,10,40,5,10,7,9,15);
	Set<Integer> set = new HashSet<>();
	
	//Set<Integer>duplicatenumber = list.stream().filter(item ->!set.add(item)).collect(Collectors.toSet());
	//duplicatenumber.stream().forEach(System.out ::println);
	list.stream().filter(item -> !set.add(item)).collect(Collectors.toSet()).forEach(System.out::println);
	}

}
