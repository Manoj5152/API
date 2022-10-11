package Testcase;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataProviderfor extends Dataset{
	
	
	
	
	@Test (dataProvider = "dataforpost", priority = 1)
	@SuppressWarnings("unchecked")
		public void dataprovider123(String purchaseamount, String product_name, String product_qty) {
		
			JSONObject request = new JSONObject();
			
			request.put("purchaseamount", purchaseamount);
			request.put("product_name", product_name);
			request.put("product_qty", product_qty);
			
			
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
	
	
	//@Test(dataProvider = "delete1",priority = 2)
	public void dataforDelete(int userid) {
		
		baseURI = "http://localhost:3000/";
		
		when().delete("/purchase/"+ userid).
			then().statusCode(200).log().all();
		
		
	}
	//@Parameters({"userid"})
	//@Test
	public void dataforDelete2(int userid) {
		
		System.out.println("Value for UserID is :" +userid);
		
		baseURI = "http://localhost:3000/";
		
		when().get("/purchase/"+ userid).prettyPrint();
	
	
}
}
