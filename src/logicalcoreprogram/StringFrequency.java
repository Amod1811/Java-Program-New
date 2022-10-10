package logicalcoreprogram;

import java.util.Scanner;

public class StringFrequency {
	public void getFrequency(String name, char input) {
		int count = 0;
		char[] charName = name.toCharArray();
		for (int i = 0; i < charName.length; i++) {
			if(input == charName[i]) {
				count++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		
		System.out.println("Enter the charater to find the fequency");
		char input = sc.next().charAt(4);
		StringFrequency demo = new StringFrequency();
		demo.getFrequency(name, input);
		
	}

}
