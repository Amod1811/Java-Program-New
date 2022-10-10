package arraylistprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(); 
		list1.add(12);
		list1.add(78);
		list1.add(15);
		list1.add(5);
		list1.add(8);
		System.out.println(list1);
		Collections.sort(list1);

	}

}
