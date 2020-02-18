package com.srini.Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CreateHashSetExample {

	 public static void main(String[] args) {
	        // Creating a HashSet
	     Set<String> daysOfWeek = new HashSet<>();

	        // Adding new elements to the HashSet
	        daysOfWeek.add("Monday");
	        daysOfWeek.add("Tuesday");
	        daysOfWeek.add("Tuesday");
	        daysOfWeek.add("Wednesday");
	        daysOfWeek.add("Thursday");
	        daysOfWeek.add("Friday");
	        daysOfWeek.add("Saturday");
	        daysOfWeek.add("Sunday");
	        daysOfWeek.add(null);
	        // Adding duplicate elements will be ignored
	        daysOfWeek.add("Monday");
	        System.out.println(daysOfWeek);
	        
	        
	        
	        TreeSet<String> fruits = new TreeSet<>();

	     // Adding new elements to a TreeSet
	     fruits.add("Banana");
	     fruits.add("Apple");
	     fruits.add("Pineapple");
	     fruits.add("Orange");

	     System.out.println("Fruits Set : " + fruits);

	     // Duplicate elements are ignored
	     fruits.add("Apple");
	     System.out.println("After adding duplicate element \"Apple\" : " + fruits);

	     // This will be allowed because it's in lowercase.
	     fruits.add("banana");
	     System.out.println("After adding \"banana\" : " + fruits);
	     
	     
	    }
}
