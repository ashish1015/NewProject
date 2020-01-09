package com.test.restassured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import resources.ReusableMethods;
public class StaticJSON {
	@Test
	public void addBook() throws IOException
	{
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		Response resp = given().
				header("Content-Type", "application/json").
				body(generateStringFromResource("/Users/ashish.tripathi/eclipse-workspace/RestAssuredLearning/src/resources/AddBookJSON.json")).
				when().
				post("/Library/Addbook.php").
				then().assertThat().statusCode(200).
				extract().response();
		JsonPath js = ReusableMethods.rawToJson(resp);
		String id = js.get("ID");
		System.out.println(id);
		// deleteBOok
	}
	
	//Static JSON - external file Example
	public static String generateStringFromResource(String path) throws IOException {

	    return new String(Files.readAllBytes(Paths.get(path)));

	}
}
