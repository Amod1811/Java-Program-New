package arraylistprogram;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list1.add("Amod");
		list1.add("Nikhil");
		list1.add("Rajesh");
		list1.add("Prasad");
		list1.add("Shree");
		
		list2.add(122);
		list2.add(344);
		list2.add(739);
		list2.add(765);
		
		System.out.println("Element in Array:"+ list1);
//		for (int i= 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
			list1.set(2, "Shushant");
			list1.set(4, "Jagveer");
			System.out.println("After Adding Second and fourth Element");
			System.out.println(list1);
			
			
			list1.remove(1);
			list1.remove(3);
			System.out.println("After removing Element");
			System.out.println(list1);
			
			System.out.println("Arraylist before sorting:" + list1);
			Collections.sort(list1);
			
			System.out.println("ArrayList After sorting :" + list1);
			
			System.out.println("Concatinate the List1 and list2:" + list1 + list2 );
			
			list3.addAll(list2);
			System.out.println(list3);
			
			for(int i = 0; i <list1.size(); i ++ ) {
			System.out.println(list1.get(i) + list2.get(i));
			}
			//System.out.println(list1);
			
			
		}
	
	}


