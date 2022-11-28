import java.awt.print.Printable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PracticeProgram {
	static int arr[] = new int[] {1,2,3,4,5,};
	public  static void MoveZeroToEnd() {
		
		
		int num = arr[arr.length-1], i;
		for(i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
			arr[0] = num; 
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Given Array Is:" + Arrays.toString(arr));
		MoveZeroToEnd();
		System.out.println("After Roated the Array" + Arrays.toString(arr));
		
	}

	
}

