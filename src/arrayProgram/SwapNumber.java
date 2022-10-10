package arrayProgram;

public class SwapNumber {
	int a = 10;
	int b = 20;
	public void swapnumber() {
		System.out.println("Before the swap number "+" "+ "a" + a +" "+ "b" + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After the swap number" +" "+ "a" + a +" "+ "b" + b);
	}
	public static void main(String[] args) {
		SwapNumber sn = new  SwapNumber();
		sn.swapnumber();
		
	}

}
