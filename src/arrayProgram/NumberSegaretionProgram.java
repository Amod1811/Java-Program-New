package arrayProgram;

import java.util.Scanner;

public class NumberSegaretionProgram {
	public void numberSegration(int arr[], int size) {
		int left = 0, right = size -1;
		while(left < right) {
			while(arr[left] == 0 && left < right) 
				left ++;
				while(arr[right] == 1 && left < right)
					right --;
					if(left < right) {
						arr[left] = 0;
						arr[right] = 1;
						left ++;
						right --;
			}
		}
	}

	public static void main(String[] args) {
		NumberSegaretionProgram obj = new NumberSegaretionProgram();
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the We want to Segrate");
		num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter" + num + "Numbers");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int arrSize = arr.length;
		obj.numberSegration(arr, arrSize);
		System.out.println("After Number Segration\n");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
