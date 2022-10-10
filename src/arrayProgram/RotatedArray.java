package arrayProgram;

import java.util.Scanner;

public class RotatedArray {
	
		public static void main(String[] args) {
			int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
			System.out.println("Original Arary ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + " ");
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number how many time rotete the array");
			int num = sc.nextInt();
			
			for(int i = 0; i < num; i ++) {
				
			int first = arr[0];
			for (int j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length-1] = first;
			}
			System.out.println();
			System.out.println("Output array");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}
