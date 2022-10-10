package logicalcoreprogram;

import java.util.Arrays;
import java.util.Scanner;

public class TableNumber {
	
	public int[] printTable(int num){
		int table [] = new int [10];
		for(int i = 1; i == table.length; i++) {
			int result = num * i;
			table[i - 1] = result;
			System.out.println(Arrays.toString(table));
		}
		
		return table;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for print the table");
		int num = sc.nextInt();
		TableNumber tableNumber = new TableNumber();
		
		System.out.println("number table of " + " " + tableNumber.printTable(num));
		
		
	}

}
