package bl.com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorWays {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        ListIterator<String> list1 = list.listIterator(list.size());
        while(list1.hasPrevious()) {
        	String str = list1.previous();
        	System.out.println(str);
        }
        System.out.println("Traverse the list using for loop");
        for(int i =0; i <list.size(); i++) {
        	System.out.println(list.get(i));
        }
        
        System.out.println("Traverse list using forEach ");
        for(String str : list) {
        	System.out.println(str);
        }
        System.out.println("Traverse the list using forEach Lambada Exprerssion");
        list.forEach(item -> System.out.println(item));
        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator item = list.iterator();
        item.forEachRemaining(p -> System.out.println(p));
	}

}
