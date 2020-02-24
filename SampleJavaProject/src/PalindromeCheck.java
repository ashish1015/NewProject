import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String args[]) {
		int r, sum = 0, temp;
		//int n = 454;// It is the number variable to be checked for palindrome
		
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();

		temp = num;
		while (num > 0) {
			r = num % 10; // getting remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}
		sc.close();
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

}
