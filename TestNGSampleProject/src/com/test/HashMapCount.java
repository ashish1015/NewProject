package com.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapCount {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Hyderabad");
		l.add("Delhi");
		l.add("Pune");
		l.add("Nodia");
		l.add("Delhi");
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (String city : l) {
			if (hm.containsKey(city))
				hm.put(city, hm.get(city) + 1);
			else
				hm.put(city, 1);
		}

		// ****Method 1 for printing No of Occurances****
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		// hashtable -pass table set collections
		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();//
			System.out.println("Key = " + mp.getKey() + " Value = " + mp.getValue());
		}

		// ****Method 2 for printing No of Occurances****
		Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			System.out.printf("%s : %d %n ", entry.getKey(), entry.getValue());
		}

	}
}
