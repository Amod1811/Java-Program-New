package arrayProgram;

public class SortedArrayDecending {

	public static void main(String[] args) {
		int arr[] = {1,4,9,6,7,2};
		int temp =0;
		System.out.println("Original Array Element");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array Element Sorted In Decending order");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			}
	}

}
