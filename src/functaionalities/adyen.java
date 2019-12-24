package functaionalities;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import generalUtilities.BaseTest;
import io.restassured.RestAssured;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
import payloads.Adyen_Payloads;
import resources.Cart_Resource;

public class adyen extends BaseTest {
	
	@BeforeTest
	public static void hitAdyen(){
		RestAssured.baseURI="https://checkout-test.adyen.com";
		RestAssured.basePath="/v51";
		System.out.println("Connecting to adyen");
	}
	
	
	@Test
	public static void linkOrderToAdyen() {
		
	
		
		Response resp= 
					given()
				   .header("Authorization","Basic d3NAQ29tcGFueS5MZWNyZXVzZXRTRkNDOlh1SWVUaEY5U0ItL11pYWtrKyZIcGNrNDk=")
				   .header("X-API-key","AQEohmfuXNWTK0Qc+iScl2cqovGITZ9+K7BpVkgAaxbmo5Y465aqR241wBDBXVsNvuR83LVYjEgiTGAH-mZ6bs5f4WG3Y4W9onIZ8Y7XPo+BccjlREbiHKw+Bgso=-qACBfyj5nhDamsr3")
				   .header("Content-Type","application/json")
				   .body(Adyen_Payloads.adyenPayloads())
				   .when()
				   .post("/payments");
		

		
		int statusCode = resp.getStatusCode();
		 String responseString = resp.asString();
		
if (statusCode == 200) {
			
			
	log.info("Payment method added successfully");
	log.info(responseString);
	Reporter.log("send details to adyen successfully");
	Reporter.log(responseString);
	System.out.println("send details to adyen successfully");
			
		}

		else {
			
			Reporter.log("Auth creation failed", false);
			Reporter.log(responseString, false);
			Reporter.getCurrentTestResult();
			System.out.println(responseString);
			Assert.fail("Test case fail");
		}
		   
					   
	}
	
	
}
