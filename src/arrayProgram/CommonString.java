package arrayProgram;

import java.util.Arrays;
import java.util.HashSet;

public class CommonString {

	public static void main(String[] args) {
		String array1[] = { "C", "C++", "C#", "JAVA", "SQL", "ORACLE" };
		String array2[] = { "MySQL", "SQL", "Android", "ORACLE", "PostgreSQL", "DB2", "JAVA" };
		System.out.println("Array1" + Arrays.toString(array1));
		System.out.println("Array2" + Arrays.toString(array2));

		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					set.add(array1[i]);
				}
			}
		}
		System.out.println("Common String is " + set);

//		String[] s1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };
//
//		String[] s2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };
//
//		HashSet<String> set1 = new HashSet<String>();
//
//		for (int i = 0; i < s1.length; i++) {
//			for (int j = 0; j < s2.length; j++) {
//				if (s1[i].equals(s2[j])) {
//					set.add(s1[i]);
//				}
//			}
//		}
//
//		System.out.println(set); // OUTPUT : [THREE, FOUR, FIVE]

		// method 2: use retainAll method
		Integer[] i1 = { 1, 2, 3, 4, 5, 4 };

		Integer[] i2 = { 3, 4, 5, 6, 7, 4 };

		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));

		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));

		set1.retainAll(set2);

		System.out.println(set1); // Output : [3, 4, 5]
	}
}
