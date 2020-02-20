import java.util.Scanner;

public class CharSwapString {

	// String abc = "HelloWorlde";

	void swapTwoLetters(String abc) {
		char[] swap = abc.toCharArray();
		if (swap.length % 2 == 0) {
			for (int k = 0; k < swap.length; k += 2) {
				System.out.print(String.valueOf(swap[k + 1]) + String.valueOf(swap[k]));
				// System.out.print(swap[k]);
			}
		} else {
			for (int k = 0; k < swap.length - 1; k += 2) {
				System.out.print(String.valueOf(swap[k + 1]) + String.valueOf(swap[k]));
			}
			System.out.print(swap[swap.length - 1]);
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the string where you want to swap two subsiquent chars :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		CharSwapString cs = new CharSwapString();
		cs.swapTwoLetters(str);
		sc.close();
	}
}
