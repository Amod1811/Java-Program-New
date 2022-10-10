package arrayProgram;

public class SortedArrayAcending {

	public void sortNumber() {
		int temp = 0;
		int arr[] = { 5, 6, 2, 9, 4, 1 };
		System.out.println("Element of original Arrray");
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		 SortedArrayAcending sortedNumber = new SortedArrayAcending();
		 sortedNumber.sortNumber();
	}

}
