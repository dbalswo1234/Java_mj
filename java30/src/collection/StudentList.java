package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentList {

	public static void main(String[] args) {
		HashMap students = new HashMap();
		Student s1 = new Student("1234","박아무개",180,"011");
		Student s2 = new Student("1234","김아무개",175,"011");
		Student s3 = new Student("1234","소아무개",161,"010");

		students.put("kg100", s1);
		students.put("kg200", s2);
		students.put("kg300", s3);
		
		System.out.println(students);
		
		

	}

}
