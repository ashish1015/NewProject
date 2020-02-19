package com.test;

import java.util.*;

public class ArrayListSortComaparator {

	public static void main(String args[]) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(111, "John", 30));
		arraylist.add(new Student(333, "Ronaldo", 31));
		arraylist.add(new Student(222, "Messi", 29));

		/* Sorting based on Student Name */
		System.out.println("Student Name Sorting:");
		Collections.sort(arraylist, Student.StuNameComparator);

		for (Student str : arraylist) {
			System.out.println(str);
		}

		/* Sorting on Rollno property */
		System.out.println("RollNum Sorting:");
		Collections.sort(arraylist, Student.StuRollno);
		for (Student str : arraylist) {
			System.out.println(str);
		}
	}
}
