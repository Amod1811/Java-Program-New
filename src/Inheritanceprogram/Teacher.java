package Inheritanceprogram;

class Department {
	String designation = "Teacher";
	String collegeName = "Beginnersbook";
	void does() {
		System.out.println("Teaching");
	}
}

class PhysicsTeacher extends Department {
	String mainSubject = "Physics";
}

class Teacher {

	public static void main(String args[]) {
		Department obj = new PhysicsTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println();
		obj.does();
	}
}
