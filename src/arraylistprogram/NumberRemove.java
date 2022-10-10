package arraylistprogram;

import java.util.ArrayList;
import java.util.Collections;

public class NumberRemove {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(5);
		list.add(8);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		//Collections.ArrayList(list.remove(0))
	}

}
