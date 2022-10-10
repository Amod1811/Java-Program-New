package bl.com.exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c;
		try {
        c = a/b;
        System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I in finally Block");
		}
	}

}
