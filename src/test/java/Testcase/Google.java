package Testcase;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Google {
	
	@Test
	public void google_req() {
		
		Response response = get("https://www.saucedemo.com/");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
			}
	
	@Test
	public void google_Req1() {
		
		given().
		//	get("https://www.amazon.in").
			get("https://www.saucedemo.com/").
		then().
			statusCode(200).log().all();
	}
	
}
