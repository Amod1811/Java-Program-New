package arraylistprogram;

import java.util.ArrayList;
import java.util.Collections;

public class SortElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Blue");
		list.add("Orange");
		list.add("White");
		list.add("Yellow");
		System.out.println("List Before sort" + list);
		Collections.sort(list);
		System.out.println("List After Sort" + list);

	}
}
