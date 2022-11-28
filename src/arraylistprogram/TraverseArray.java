package arraylistprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
			
			ArrayList<String> list=new ArrayList<String>();//Creating arraylist
	        list.add("Ravi");//Adding object in arraylist
	        list.add("Vijay");
	        list.add("Ravi");
	        list.add("Ajay");

	        System.out.println("Traversing list through List Iterator:");
	        //Here, element iterates in reverse order
	        ListIterator<String> list2=list.listIterator(list.size());
	        while(list2.hasPrevious())
	        {
	            String str=list2.previous();
	            System.out.println(str);
	        }
	        System.out.println("Traversing list through for loop:");
	        for(int i=0;i<list.size();i++)
	        {
	            System.out.println(list.get(i));
	        }

	        System.out.println("Traversing list through forEach() method:");
	        //The forEach() method is a new feature, introduced in Java 8.
	        list.forEach(a->{ //Here, we are using lambda expression
	            System.out.println(a);
	        });

	        System.out.println("Traversing list through forEachRemaining() method:");
	        java.util.Iterator<String> itr=list.iterator();
	        itr.forEachRemaining(a-> //Here, we are using lambda expression
	        {
	            System.out.println(a);
	        });
			
		

	}

}
