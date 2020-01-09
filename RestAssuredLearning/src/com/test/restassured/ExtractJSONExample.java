package com.test.restassured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import resources.ReusableMethods;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
public class ExtractJSONExample {
	private String name;
	@Test
	public void extractingNamesAPI() {
		// TODO Auto-generated method stub
		// BaseURL or Host
		RestAssured.baseURI = "https://maps.googleapis.com";
		Response res = given().//Given
				param("location", "-33.8670522,151.1957362").param("radius", "500")
				.param("key", "AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").log().all().
				when().//When
				get("/maps/api/place/nearbysearch/json").
				then().//Then
				assertThat().statusCode(200).and()
				.contentType(ContentType.JSON).and().body("results[0].name", equalTo("Sydney")).and()
				.body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and()//equalTo used while comparing text in body.
				.header("Server", "scaffolding on HTTPServer2").log().body().extract().response();//equalTo not used(for header text).
		JsonPath js = ReusableMethods.rawToJson(res);
		int count = js.get("results.size()");
		for (int i = 0; i < count; i++) {
			name = js.get("results[" + i + "].name");
			System.out.println("Names under Results at position " + i + " is : " + name);
		}
		System.out.println(count);
		/*
		 * header("dfd","fsdfds"). cookie("dsfs","csder"). body()
		 */
		// Status code of the response
		// Content type
		// Body
		// Header responses
	}
}
