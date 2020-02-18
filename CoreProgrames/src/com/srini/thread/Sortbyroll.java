package com.srini.thread;

import java.util.Comparator;

public class Sortbyroll implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		
		return a.rollNo - b.rollNo; 
	}

	
	
}
