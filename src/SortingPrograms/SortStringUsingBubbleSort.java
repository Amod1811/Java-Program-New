package SortingPrograms;

public class SortStringUsingBubbleSort {
	public static void main(String[] args) {
		System.out.println("Before Sorting Array Element");
		String arr[] = { "Umesh", "Likesh", "Tappu", "Ashish" };
		String temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
//arr.length=5 and arr.length-1 = 4 in bubble sort loop will be executed length-1
//means num of element less than 1	and arr.length-1-i used for not compare the 
//sorted pair repeated again and again 			                                       
				if (arr[j].compareTo(arr[j + 1]) > 0) {
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
