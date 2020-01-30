import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

public class ReverseOrderOfWords {
	public static void main(String args[]) {
		System.out.println(ReverseOrderOfWords.reverseWords("My name is Anuradha Tripathi"));
		
		System.out.println(ReverseOrderOfWords.reverseString("My name is Ashish Tripathi"));
		
	  }
	 
	  /*
	  * Method to reverse words in String in Java
	  */
	  public static String reverseWords(String sentence) {
	  List< String> words = Arrays.asList(sentence.split("\\s"));
	  //Collections.reverse(words); -->> Another Way
	  
	  StringBuilder sb = new StringBuilder(words.size());
	 
	  for (int i = words.size() - 1; i >= 0; i--) {
	  sb.append(words.get(i));
	  sb.append(' ');
	  }
	 
	  return sb.toString().trim();
	  }
	 
	  /*
	   * Another Method to reverse words in String in Java
	   */
	  public static String reverseString(String line) {
	  if (line.trim().isEmpty()) {
	  return line;
	  }
	 
	  StringBuilder reverse = new StringBuilder();
	  String[] sa = line.trim().split("\\s");
	 
	  for (int i = sa.length - 1; i >= 0; i--) {
	  reverse.append(sa[i]);
	  reverse.append(' ');
	  }
	 
	  return reverse.toString().trim();
	  }
	}
