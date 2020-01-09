import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class ValidatePhoneFormat {

	public void checkUSFormat() {
	           
	}	
	
//	For example, here are some of the common way of writing phone numbers:
//
//		1234567890
//		123-456-7890
//		123-456-7890 x1234
//		123-456-7890 ext1234
//		(123)-456-7890
//		123.456.7890
//		123 456 7890
	
	private static boolean validatePhoneNumber(String phoneNo) {
		//validate phone numbers of format "1234567890"
		if (phoneNo.matches("\\d{10}")) return true;
		//validating phone number with -, . or spaces
		else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
		//validating phone number with extension length from 3 to 5
		else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
		//validating phone number where area code is in braces ()
		else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
		//Validating US phone number with country code and area code
		else if(phoneNo.matches("\\+1\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
	
		//return false if nothing matches the input
		else return false;
		
	}
	
//	private static boolean validateEmail(String phoneNo) {
//		//validate phone numbers of format "1234567890"
//		if (phoneNo.matches("\\()")) return true;
//		//validating phone number with -, . or spaces
//		else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
//		//validating phone number with extension length from 3 to 5
//		else return false;
//		
//	}
		public static void main(String[] argv) {

//		      String sPhoneNumber = "605-8889999";
//		      //String sPhoneNumber = "605-88899991";
//		      //String sPhoneNumber = "605-888999A";
//
//		      Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
//		      Matcher matcher = pattern.matcher(sPhoneNumber);
//		      
//		      if (matcher.matches()) {
//		    	  System.out.println("Phone Number Valid");
//		      }
//		      else
//		      {
//		    	  System.out.println("Phone Number must be in the form XXX-XXXXXXX");
//		      }
//		 }
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your phone Number: ");  
		    String phoneNumber = sc.nextLine(); 
		    
		    System.out.println("Your Phone Numnber "+phoneNumber+"  is Valid: " + validatePhoneNumber(phoneNumber));             
		    sc.close();  
	}
}
