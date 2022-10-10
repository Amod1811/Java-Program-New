package arrayProgram;

import java.util.Scanner;

public class MatrixMultiPlication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base of matrices");
		int num = sc.nextInt();

		int a[][] = new int[num][num];
		int b[][] = new int[num][num];
		int c[][] = new int[num][num];
		System.out.println("Enter the first matrix number in row");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				a[i][j] = sc.nextInt();
			}

		}
		System.out.println("Enter the second matrix number in row");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Multiplication both of matrices");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				for (int k = 0; k < num; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[j][k];
				}
			}
		}
		System.out.println("The product of matrices");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.println(c[i][j]);
				}
			}
	}

}
