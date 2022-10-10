package streamprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int sid;
	char grade;
	public Student(String name, int sid, char grade) {
		super();
		this.name = name;
		this.sid = sid;
		this.grade = grade;
	}
}
public class UseFaltMapMethod1 {

	public static void main(String[] args) {
		
		List<Student>studentList1 = new ArrayList<>();
		studentList1.add(new Student("jerry", 101, 'A'));
		studentList1.add(new Student("merry", 102, 'B'));
		studentList1.add(new Student("kerry", 103, 'c'));
		
		List<Student>studentList2 = new ArrayList<>();
		studentList2.add(new Student("Cherry", 104, 'A'));
		studentList2.add(new Student("zerry", 105, 'B'));
		studentList2.add(new Student("perry", 106, 'C'));
		List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);
		
		//Before java8 or without flatmap method in stream
		
		/*for(List<Student> s: studentList) {
			for(Student stu:s) {
				System.out.println(stu.name);
			}
		}*/
		
		//Using Stream flatmap()
		List<String>sname = studentList.stream()
				.flatMap(sList->sList.stream().map(n->n.name))
				.collect(Collectors.toList());
		System.out.println(sname);
	}

}
