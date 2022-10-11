package Testcase;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TC_OWNDB {
	
	
	@Test
	@SuppressWarnings("unchecked")
	public void test_ownDB() {
		
		
		JSONObject request = new JSONObject();
		
		request.put("product_name", "Jogger Pant");
		request.put("product_qty", "25");
		request.put("purchaseamount", "10000");
		
		
		baseURI = "http://localhost:3000/";
		
		given().
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			header("Content-Type", "application/json").
			body(request.toJSONString()).
		when().
			post("/purchase").
		then().
			statusCode(201).
			log().all();
	}
	
	@Test
	public void param() {
		baseURI = "http://localhost:3000/";
		
		given().
		param("id", "2").
		when().get("/purchase").then().
		log().all();
		
	}
	
	@Test
	public void delete() {
		baseURI = "http://localhost:3000/";
		
		when().
		delete("/purchase/8").
		then().
		statusCode(200).log().all();
		
	}

}
