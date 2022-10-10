package methodoverloading;

public class Demo {
//	int a = 10;
//	int b= 20;
	public int getMethod(int a , int b) {
		System.out.println("Perform multiplication");
		int mul = a*b;
		return mul;
	}
	
	public void getMethod(String name , int num) {	
		System.out.println("Welcome to method 2");
	}
	public void getMethod(int num) {
		System.out.println("Welcome to method 3");
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.getMethod(101);
		
		int mul1 = demo.getMethod(20, 78);
		System.out.println("multiplication of two intger number" + mul1);
		
		demo.getMethod("Ashish", 102);

	}

}
