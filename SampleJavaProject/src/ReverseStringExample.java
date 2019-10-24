import java.util.Scanner;

public class ReverseStringExample {

	public static void main(String[] args) 
	{
		
		
//	System.out.println("program started");
//	String str="sun rises in the east";
//	char[] arr=str.toCharArray();
//	for (int i=arr.length-1;i>=0 ; i--)
//	{
//	System.out.print(arr[i]);
//	}
	
		
//		 String S= "dear god"; 
//		 String[] SP = S.split(" "); 
//		 for(int i=SP.length-1;i>=0;i--)
//		 {
//			 System.out.print(SP[i]+" "); 
//		 }
		 
		
		System.out.println("Enter the String...");
		Scanner scan=new Scanner(System.in);
		String x = scan.next();
		StringBuffer sb=new StringBuffer(x);
		System.out.println(sb.reverse());
		scan.close();
		System.out.println("Done");
		
//		//quick wasy to reverse String in Java - Use StringBuffer
//        String word = "HelloWorld";
//        String reverse = new StringBuffer(word).reverse().toString();
//        System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
//      
//        //another quick to reverse String in Java - use StringBuilder
//        word = "WakeUp";
//        reverse = new StringBuilder(word).reverse().toString();
//        System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
	}
	
}
