package com.test;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class HashMapexample {

	public static void main(String[] args) { // TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(42, "morning");
		hm.put(41, "morning");
		hm.put(3, "evening");
		hm.remove(42);
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		// hashtable -pass table set collections
		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();//
			System.out.println("Key = "+mp.getKey()+" Value = "+mp.getValue());
		}
	}

}
