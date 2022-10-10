package arraylistprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareArrayList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(); 
		list1.add(12);
		list1.add(78);
		list1.add(15);
		list1.add(5);
		list1.add(8);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>(); 
		list2.add(12);
		list2.add(78);
		list2.add(15);
		list2.add(5);
		list2.add(8);
		System.out.println(list2);
		System.out.println(list1.equals(list2));
		
		List<String> list3 = new ArrayList<>();
		list3.add("jdj");
		list3.add("hjh");
		list3.add("jcd");
		list3.add("ksk");
		System.out.println(list3);
		System.out.println(list1.equals(list3));
		
	}

}
