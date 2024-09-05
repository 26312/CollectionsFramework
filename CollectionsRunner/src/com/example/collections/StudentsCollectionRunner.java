package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}


public class StudentsCollectionRunner {
	

	public static void main(String[] args) {

		List<Student> students = List.of(new Student(2, "Ranga"),
				new Student(3,"Anna"), new Student(1,"Varun"));
		
		System.out.println("Before Sort: " + students);
		List<Student> studentsAL = new ArrayList<>(students);
		/**
		 * Below we get a compiler error:
		 * The method sort(List<Student>) is undefined for the type Collection
		 * This is because we are sorting the value of type "Student" within List
		 * Types: Integer or String implement an Interface called " Comparable<String>".
		 * Thus, we need to implement Comparable under Student.java class 
		 */
		
		Collections.sort(studentsAL);
		
		System.out.println("After Sort: "+studentsAL);
		
		Collections.sort(studentsAL, new DescendingStudentComparator());
		System.out.println("DescendingStudentComparator: "+studentsAL);

	}

}
