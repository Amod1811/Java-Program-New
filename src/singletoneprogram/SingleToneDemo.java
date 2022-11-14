package singletoneprogram;

public class SingleToneDemo {
// constructor should be private
	//create static variable
	// our goal is to create a class that can have one object
	
		
	static public SingleToneDemo sc; // create reference object
	private SingleToneDemo() {// private constructor 
		
	}
	
	//create private constructor sp we cant use that constructor outside the class
	
	//to create a method which refer ton only one object of the class
	
	public static  SingleToneDemo getInstance() {
		if(sc == null) {
			sc = new SingleToneDemo();
		
		}
		return sc;
	}
	public void  print() {
		System.out.println("Hello world");
	}
}

 class Main{
	 public static void main(String[] args) {
		SingleToneDemo singleToneDemo;
		singleToneDemo = SingleToneDemo.getInstance();
		singleToneDemo.print();
		
		SingleToneDemo s1;
		s1 = SingleToneDemo.getInstance();
		s1.print();
	}
 }
