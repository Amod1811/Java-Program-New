package StringMethodProgram;

public class StringToStringBuilder {

	public static void main(String[] args) {
		String str[] = { "Scaler", "by", "InterviewBit!" };

		StringBuilder sb = new StringBuilder();
		sb.append(str[0]);
		sb.append(" " + str[1]);
		sb.append(" " + str[2]);

		System.out.println("Convert String into StringBuilder:" + " " + sb.toString());
	}

}
