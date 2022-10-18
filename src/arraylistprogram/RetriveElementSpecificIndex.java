package arraylistprogram;

import java.util.ArrayList;

public class RetriveElementSpecificIndex {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Blue");
		list.add("Orange");
		list.add("White");
		list.add("Yellow");
		for (String element : list) {
			System.out.println(element);
		}
		String element = list.get(0);
		System.out.println("First Element"+" "+ element);
		String element1 = list.get(4);
		System.out.println("Last Element" +" "+ element1);

	}

}
