package arrayProgram;

public class CheckGretestAndSmallestNumber {

	public static void main(String[] args) {
		int arr[] = {2,5,1,7,1,8,1,9,100,};
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int number : arr) {
			if(number > largest) {
				largest = number;
			}else if(smallest > number) {
				smallest = number;
			}
		}
		System.out.println("Largest  number are " + largest);
		System.out.println("smallest number are " + smallest);
	}

}
