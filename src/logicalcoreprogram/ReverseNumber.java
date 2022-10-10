package logicalcoreprogram;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 67;
		System.out.println("Forward order");
		for(int i = 1; i <= n; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Reverse order");
		for(int j = n; j >= 1; j--) {
			if(j % 5 == 0 ) {
				System.out.println(j);
			}
		}
	}
}