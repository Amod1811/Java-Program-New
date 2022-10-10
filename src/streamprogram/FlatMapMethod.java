package streamprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethod {

	public static void main(String[] args) {
		//use of map method
		
		List<Integer> list1=Arrays.asList(1,4,6,8,3,7);
		List<Integer> list2 = new ArrayList<>();
		list2=list1.stream().map(n->n+10).collect(Collectors.toList());
			System.out.println(list2);
			
			//use flatmap() method
		List<Integer>list=Arrays.asList(1,2);
		List<Integer>list3=Arrays.asList(2,5);
		List<Integer>list5=Arrays.asList(5,8);
		List<Integer>list6=Arrays.asList(7,4);
		
		List<List<Integer>>finalList=Arrays.asList(list,list3,list5,list6);
		//List<Integer>finalresult=finalList.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
						//OR use map method to arraylist add 10
		List<Integer>finalresult=finalList.stream().flatMap(x-> x.stream().map(n->n+10)).collect(Collectors.toList());
			System.out.println(finalresult);
	}

}
