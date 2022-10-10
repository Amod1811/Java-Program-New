package Inheritanceprogram;
class CollegeManegment{
	String collegename ="PCE";
	String department = "CT";
	
	//void show() {
		//System.out.println("Welcome to college");
	}
	 class Student extends CollegeManegment{
		int sid = 101;
		String studentname = "Amod";
		
	
}
public class College {
	
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.collegename);
		System.out.println(student.department);
		System.out.println(student.studentname);
		
	 
}
	}


