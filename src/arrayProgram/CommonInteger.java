package arrayProgram;

import java.util.Arrays;

public class CommonInteger {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 9, 6 };
		int arr2[] = { 1, 3, 4, 9, 7 };

		System.out.println("Arrays1" + Arrays.toString(arr));
		System.out.println("Arrays2" + Arrays.toString(arr2));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {
					System.out.println("Common element is " + arr[i] + " ");
				}
			}
		}
	}
}
