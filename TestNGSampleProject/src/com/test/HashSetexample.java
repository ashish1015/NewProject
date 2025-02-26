package com.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetexample {

	public static void main(String[] args) { // TODO Auto-generated method stub

		// HashSet treeset, LinkedHashset implements Set interface
		// does not accept duplicate values
		// There is no guarantee elements stored in sequential order..Random order
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("AUSTRALIA");
		hs.add("NEPAL");
		hs.add("INDIA");//Will not be added as HashSet does not accept duplicate values.
		System.out.println(hs);
		// System.out.println(hs.remove("UK"));
//		System.out.println(hs.isEmpty());
//		System.out.println(hs.size());
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
