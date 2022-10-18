package SortingPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Before Sorting Array Element");
		int arr[] = { 19, 23, 5, 15, 8, 3, 9, 18, 4 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
//arr.length=5 and arr.length-1 = 4 in bubble sort loop will be executed length-1
//means num of element less than 1	and arr.length-1-i used for not compare the 
//sorted pair repeated again and again 			                                       
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {// means all element is soreted and loop will break
				break;
			}
		}
		System.out.println("After sorting the Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
