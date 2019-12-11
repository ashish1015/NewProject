
public class ReverseStringExample1 {

	public String reverseString(String str) {

		if (str.length() == 1) {
			return str;
		}
		String reverse = "";

		reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
		return reverse;
	}

	public static void main(String a[]) {
		ReverseStringExample1 srr = new ReverseStringExample1();
		System.out.println("Result: " + srr.reverseString("Java Programming"));
	}
}
