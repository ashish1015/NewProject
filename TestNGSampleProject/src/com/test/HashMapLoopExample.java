package com.test;

import java.util.*;

public class HashMapLoopExample {
	public static void main(String args[]) {

		// Creating a HashMap of String keys and String values
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("Key1", "Value1");
		hashmap.put("Key2", "Value2");
		System.out.println("Iterating or looping map using foreach loop");
		// Iterating or looping using keySet() method
		for (String key : hashmap.keySet()) {
			System.out.println("key: " + key + " value: " + hashmap.get(key));
		}

// Iterating or looping using keySet() method
		System.out.println("Iterating or looping using keySet() method");
		Set<String> keySet = hashmap.keySet();
		Iterator<String> keySetIterator = keySet.iterator();
		while (keySetIterator.hasNext()) {
			String key = keySetIterator.next();
			System.out.println("key: " + key + " value: " + hashmap.get(key));
		}

		// Iterating or looping using entrySet() method
		System.out.println("Iterating or looping using entrySet() method");
		Set<Map.Entry<String, String>> entrySet = hashmap.entrySet();
		for (Map.Entry entry : entrySet) {

			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}

// Iterating or looping using entrySet() method
		System.out.println("Iterating or looping using entrySet() method");
		Set<Map.Entry<String, String>> entrySet1 = hashmap.entrySet();
		Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();
		while (entrySetIterator.hasNext()) {
			Map.Entry entry = entrySetIterator.next();

			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
	}
}
