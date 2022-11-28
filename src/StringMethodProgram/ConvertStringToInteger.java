package StringMethodProgram;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str);
		//int result = Integer.parseInt(str);// using parseInt
		int result = Integer.valueOf(str);
		System.out.println(result);

	}

}
