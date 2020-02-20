import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//class A {
//
//	void A1(){
//		System.out.println("A called");
//	}
//}
//
//class Base extends A{
//	
//	void Base1(){
//		System.out.println("B called");
//		A1();
//	}
//	
//}

public class ConstructorsCall{
	
//	ConstructorsCall(){
//		System.out.println("C called");
//	}
	
	
	
	 static void test() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		List<Integer> l= new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		l.add(7);
		l.add(22);
		
		Iterator<Integer> itr = l.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
			
		}
		
}}
