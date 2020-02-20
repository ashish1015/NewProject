//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class CollectionDemoNoOfOccurances {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		// Print unique number from the list- Amazon
		// print the string in reverse
		//ArrayList<Integer> ab = new ArrayList<Integer>();
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int b : a) {
			if(mp.containsKey(b)) {
				mp.put(b, mp.get(b)+1);
			}
			else {
				mp.put(b, 1);
			}
		}
		
		for(int c : mp.keySet()) {
			System.out.println("Number "+c+" is occurred "+mp.get(c)+" times");
		}
//		for (int i = 0; i < a.length; i++) {
//			int k = 0;
//			if (!ab.contains(a[i])) {
//				ab.add(a[i]);
//				k++;
//				for (int j = i + 1; j < a.length; j++) {
//					if (a[i] == a[j]) {
//						k++;
//					}
//				}
//				if (k > 1)
//					System.out.println("Number with more than one occurance is  " + a[i] + " and it reoccured =" + k
//							+ " number of times");
//				// System.out.println(k);
//				if (k == 1)
//					System.out.println(a[i] + " is unique number");
//			}
//		}
	}
}
