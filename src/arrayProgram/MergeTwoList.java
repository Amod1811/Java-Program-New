package arrayProgram;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(8);

		List<Integer> list2 = new ArrayList<>();
		list1.add(6);
		list1.add(8);
		list1.add(1);
		list1.add(9);

		ArrayList<Integer> merge = new ArrayList<>();
		merge.addAll(list1);
		merge.addAll(list2);

		System.out.println("List1:" + list1);
		System.out.println("List2:" + list2);
		System.out.println("merged:" + merge);

	}

}
