//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
public class EmailValidatorTest {
	//private static final String EMAIL_REGEX_original = "^(?i)([\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,}))$";
	private static final String EMAIL_REGEX = "^(?i)([\\w-+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,}))$";
	private static final String emailRegex_Exm1 = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
            "[a-zA-Z0-9_+&*-]+)*@" + 
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
            "A-Z]{2,7}$"; 
	// static Pattern object, since pattern is fixed
//	private static Pattern pattern;
//
//	// non-static Matcher object because it's created from the input String
//	private Matcher matcher;
//	public EmailValidatorTest() {
//		// initialize the Pattern object
//		pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
//	}
	/**
	 * This method validates the input email address with EMAIL_REGEX pattern
	 * 
	 * @param email
	 * @return boolean
	 */
//	public boolean validateEmail(String email) {
//		matcher = pattern.matcher(email);
//		return matcher.matches();
//		return email.matches(EMAIL_REGEX);
//	}
	private static final String[] validEmailIds = new String[] { "_journaldev@yahoo.com", "journaldev100-100@yahoo.com",
			"journaldev.100@yahoo.com", "journaldev111@journaldev.com", "journaldev-100@journaldev.net",
			"journaldev.100@journaldev.com.au", "journaldev@1.com", "journaldev@gmail.com.com",
			"journaldev+100@gmail.com", "journaldev-100@yahoo-test.com", "journaldev_100@yahoo-test.ABC.CoM" };
	// list of invalid email addresses
	private static final String[] invalidEmailIds = new String[] { "journaldev.@test.com", "journaldev@.com.my",
			"journaldev123@gmail.a", "journaldev123@.com", "journaldev123@.com.com", ".journaldev@journaldev.com",
			"journaldev()*@gmail.com", "journaldev@%*.com", "journaldev..2002@gmail.com", "journaldev.@gmail.com",
			"journaldev@journaldev@gmail.com", "journaldev@gmail.com.1a" };

	// private static EmailValidatorTest emailValidator;
	public static void main(String args[]) {
		// emailValidator = new EmailValidatorTest();
		for (String temp : validEmailIds) {
			// boolean valid = emailValidator.validateEmail(temp);
//			boolean valid = temp.matches(EMAIL_REGEX);
//			System.out.println("Email ID " + temp + " is valid? " + valid + "\n");
			if(temp.matches(EMAIL_REGEX)) {
				System.out.println("Email ID " + temp + " is VALID.");
			}
			else
				System.out.println("Email ID " + temp + " is NOT valid.");
		}
		System.out.println("\n\n");
		for (String temp : invalidEmailIds) {
			// boolean valid = emailValidator.validateEmail(temp);
//			boolean valid = temp.matches(emailRegex_Exm1);
//			System.out.println("Email ID " + temp + " is valid? " + valid + "\n");
			
			if(temp.matches(emailRegex_Exm1)) {
				System.out.println("Email ID " + temp + " is VALID.");
			}
			else
				System.out.println("Email ID " + temp + " is NOT valid.");
		}
	}
}
