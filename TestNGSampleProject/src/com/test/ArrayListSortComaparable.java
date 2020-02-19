package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortComaparable {

	public static void main(String args[]) {

		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(222, "Messi", 29));
		arraylist.add(new Student(333, "Ronaldo", 31));
		arraylist.add(new Student(111, "john", 23));

		Collections.sort(arraylist);

		for (Student str : arraylist) {
			System.out.println(str);
		}
	}
}
