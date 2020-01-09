package resources;

public class PayloadRepo {
	
	public static String addBook(String isbn, String aisle) {
		String payloadstr="{\r\n\"name\":\"Learn Appium Automation with Java\",\r\n\"isbn\":\""+isbn+"\",\r\n\"aisle\":\""+aisle+"\",\r\n\"author\":\"John foe\"\r\n}";
		return payloadstr;
		
		
	}

}
