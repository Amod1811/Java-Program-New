package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MoveToZeroFront {
private static void MoveZeroToEnd(int inputArray[] ) {
		
		int counter = inputArray.length-1;
		for(int i =inputArray.length-1; i >=0; i--) {
			if(inputArray[i]!=0) {
				inputArray[counter] = inputArray[i];
				counter--;
			}
		}
		while (counter >= 0)
        {
            inputArray[counter] = 0;
  
            counter--;
        }
		System.out.println(Arrays.toString(inputArray));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		MoveZeroToEnd(new int[] {0,3,0,8,0,12,0});
	}

}
