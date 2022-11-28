package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayPair {
	public static void arrayPair(int inputArray[], int inputNumber) {
		// Sorting the given array
		Arrays.sort(inputArray);
		
		// Initializing i to first index
		int i = 0;

		// Initializing j to last index
		int j = inputArray.length - 1;

		// Till i crosses j, perform the following task
		while (i < j) {
			// If inputArray[i]+inputArray[j] is equal to inputNumber
			if (inputArray[i] + inputArray[j] == inputNumber) {
				System.out.println(inputArray[i] + "+" + inputArray[j] + "=" + inputNumber);
				i++;
				j++;

			} else if (inputArray[i] + inputArray[j] < inputNumber) {
				i++;
			} else if (inputArray[i] + inputArray[j] > inputNumber) {
				j--;
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber;
		System.out.println("Enter the Number for sum");
		inputNumber = sc.nextInt();
		arrayPair(new int[] { 5, 9, 4, 2, 3, 6, 2, 1, 7 }, inputNumber);
	}

}
