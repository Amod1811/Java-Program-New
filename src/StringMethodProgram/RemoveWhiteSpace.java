package StringMethodProgram;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "  fkfk kk  kkd d";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
