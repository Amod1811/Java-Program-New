package StringMethodProgram;

public class CheckStringContaentIgnoreCase {

	public static void main(String[] args) {
		String firtsString = "MY NAME IS AMOD";
		String secondString = "my name is amod";
		
		//check string is equal or not using equal method
		System.out.println("Checking using Equal Method" + " "+ firtsString.equals(secondString));
		//check String is equal or not using IgnoreCase()
		System.out.println("Checking using IgnoreCase"+" "+ firtsString.equalsIgnoreCase(secondString));
		//check String is same or not using content method
		System.out.println("Checking using IgnoreCase"+" "+ firtsString.contentEquals(secondString));
	}

}
