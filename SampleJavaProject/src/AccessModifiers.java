
public class AccessModifiers {

	 //private static int a=10; 
	//==>Above line will result in compile time error when var is accessed in another class
	static int a=10;
	
}

class B extends AccessModifiers{
	
	public static void main(String args[]) 
	 {
		
		System.out.println(a);
	 }
	
	
}
