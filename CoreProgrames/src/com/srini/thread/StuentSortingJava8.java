package com.srini.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StuentSortingJava8 {

	
	public static void main(String args[]) {
		
		List<Student> sl= new ArrayList<Student>();
		
		sl.add(new Student(123,"Srinivas","Serangoon"));
		sl.add(new Student(444,"Ravi","Changi"));
		sl.add(new Student(111,"Rekha","Pungole"));
		
		Comparator<Student> c = Comparator.comparing(Student::getRollNo);
		Collections.sort(sl,c);
		
		for (Student s : sl) {
			System.out.println("SNO : "+s.rollNo+" SNAME :"+s.name);
		}
	}
}
