package arraylistprogram;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Blue");
		list.add("Orange");
		list.add("White");
		list.add("Yellow");
		if(list.contains("Green")) {
			System.out.println("Element is found is found");
		}else {
			System.out.println("Element not Found");
		}
//		for (String element : list) {
//			System.out.println(element);
//		}

	}

}
