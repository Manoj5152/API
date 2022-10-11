package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class TC_GET {
	
	@Test
	public void TestCase_01() {
	
	Response response = //RestAssured.
			get("https://reqres.in/api/users?page=2");
	
	System.out.println(response.getStatusCode());
	System.out.println(response.getBody());
	System.out.println(response.asString());
	System.out.println(response.getContentType());
	
	int code = response.getStatusCode();
	Assert.assertEquals(code, 200);
	}
	@Test
	public void TestCase_02() {
		given().get("https://reqres.in/api/users?page=2").
		then().statusCode(200).
		body("data.id[1]", equalTo(8)).
		body("data.first_name", hasItems("Michael","Lindsay"));
	}

}
