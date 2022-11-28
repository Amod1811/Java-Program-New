package StringMethodProgram;

import java.util.Arrays;

public class ToCovertByteArray {

	public static void main(String[] args) {
		String str = "Amod";
		byte[] byteArray = str.getBytes();
		System.out.println("Converts String into byte Arrays:" + " " + Arrays.toString(byteArray));

	}

}
