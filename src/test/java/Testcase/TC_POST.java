package Testcase;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class TC_POST {

	@Test (enabled = true)
	public void test_01() {
		
		// With out JSON Library
//		
//		Map<String, Object> map = new HashMap<String, Object>();
//		
//		map.put("name", "Manoj");
//		map.put("role", "QA");
//		
//		System.out.println(map);
		
		// With Json Library
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Manoj");
		request.put("role", "Tester");
		System.out.println(request);
		
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users/pages=2").
		then().
			statusCode(201).
			log().all();
		
	}
	
	//@Test(enabled = true)
	public void test_02() {
        
		JSONObject request = new JSONObject();
		
		request.put("name", "Manoj");
		request.put("role", "Tester");
		System.out.println(request);
		//System.out.println(request.toJSONString());
		
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users/2").
		then().
			statusCode(201);
			//log().all();
	}
	
	//@Test(enabled = true)
	public void test_03(){
JSONObject request = new JSONObject();
		
		request.put("name", "Krishna");
		request.put("role", "QA");
		System.out.println(request);
		//System.out.println(request.toJSONString());
		
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.TEXT).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
	}
	
	//@Test(enabled= true)
	public void test_04() {
//JSONObject request = new JSONObject();
		
//		request.put("name", "Manoj");
//		request.put("role", "Tester");
//		System.out.println(request);
//		System.out.println(request.toJSONString());
//		
//		given().
//			header("Content-Type", "application/json").
//			contentType(ContentType.JSON).
//			accept(ContentType.JSON).
//			body(request.toJSONString()).
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();
	}
	
}
