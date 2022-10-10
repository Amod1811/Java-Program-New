package arraylistprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;

public class TraverseArray {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(); 
		list1.add(12);
		list1.add(78);
		list1.add(15);
		list1.add(5);
		list1.add(8);
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i) + " ");
		}
			System.out.println("============================================================");
			
		List<Integer> list = Arrays.asList(1, 3, 4, 8, 276, 84);
			
			//Using for each method
			for(Integer i : list)
				System.out.print(i + " ");
			
		

	}

}
