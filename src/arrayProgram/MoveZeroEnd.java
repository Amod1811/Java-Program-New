package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroEnd {
	private static void MoveZeroToEnd(int inputArray[]) {

		int counter = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter++;
			}
		}
		while (counter < inputArray.length) {
			inputArray[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(inputArray));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MoveZeroToEnd(new int[] { 0, 3, 0, 8, 0, 12, 0 });
	}

}
