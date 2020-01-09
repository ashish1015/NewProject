package com.test.restassured;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import resources.ReusableMethods;
import resources.PayloadRepo;

public class DynamicJSON {
	// Dynamic JSON Example
	@Test(dataProvider = "BooksData")
	public void addBook(String isbn, String aisle) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		Response resp = given().header("Content-Type", "application/json").body(PayloadRepo.addBook(isbn, aisle)).when()
				.post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response();
		JsonPath js = ReusableMethods.rawToJson(resp);
		String id = js.get("ID");
		System.out.println(id);
		// deleteBOok
	}

	@DataProvider(name = "BooksData")
	public Object[][] getData() {
		// array=collection of elements
		// multidimensional array= collection of arrays
		return new Object[][] { { "isbn1", "aisle1" }, { "isbn2", "aisle2" }, { "isbn3", "aisle3" } };
	}
}
