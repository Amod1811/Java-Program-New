package arraylistprogram;

import java.util.ArrayList;

public class HobbiesPrint {

	public static void main(String[] args) {
		System.out.println("Hello world");
		ArrayList<String> list = new ArrayList<String>();
		
	list.add("Cricket");
	list.add("Singing");
	list.add("Dancing");
	list.add("Reading");
	//System.out.println(list);
	System.out.println("My hobbies are:" +  list.set(2, "Dancing") + " " + list.set(3, "Reading"));
	
	
	}

}
