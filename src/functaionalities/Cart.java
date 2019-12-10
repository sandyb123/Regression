package functaionalities;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;

import generalUtilities.BaseTest;
import io.restassured.path.json.JsonPath;
import payloads.Cart_Payloads;
import resources.Cart_Resource;
import resources.Home_CLP_PLP_Search_Resource;



public class Cart extends BaseTest {
	public static void createAuth() throws IOException {
		BaseTest.Home_CLP_PLP_Search_data();
		System.out.println("create auth start");
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.body("{\r\n\"type\":\"guest\"\r\n}")
				.when()
				.post(Cart_Resource.authResource());
		
		statusCode=response.getStatusCode();
		responseString=response.asString();
		
		if (statusCode == 200) {
			
			log.info("Auth created successfully");
			log.info(responseString);
			Reporter.log("Auth created successfully");
			Reporter.log(responseString);
			 auth = response.getHeader("Authorization");
			//JsonPath auth = response.jsonPath().get("Authorization");
			System.out.println(auth);
			
		}

		else {
			log.error("Auth creation failed");
			log.error(responseString);
			Reporter.log("Auth creation failed", false);
			Reporter.log(responseString, false);
			Reporter.getCurrentTestResult();
			Assert.fail("Test case fail");
		}
		
		
	}
	
	public static void createBasket() throws IOException {
		//BaseTest.Home_CLP_PLP_Search_data();
		System.out.println("create basket start");
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.header("Authorization",auth)
				.when()
				.post(Cart_Resource.cartResource());
		
		statusCode=response.getStatusCode();
		responseString=response.asString();
		
		if(statusCode==200) {
							 
			log.info("Basket creation successfully");
			log.info(responseString);
			Reporter.log("Basket created successfully");
			Reporter.log(responseString);
			basketId=response.getBody().jsonPath().get("basket_id");
			
			System.out.println(basketId);
		}
		
		else{
			log.error("Basket creation failed");
			log.error(responseString);
			Reporter.log("Basket creation failed",false);
			Reporter.log(responseString,false);
			Reporter.getCurrentTestResult();
			Assert.fail("Test case fail");
		}
		
	}
	
	public static void addItemToBasket() throws IOException {
		//BaseTest.Home_CLP_PLP_Search_data();
		System.out.println("add item to basket start");
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.header("Authorization",auth)
				.body("[{\r\n" + 
						"  \"product_id\" : \"ABH01-32198\",\r\n" + 
						"  \"quantity\" : 2\r\n" + 
						"}]")
				.pathParam("basket_id", basketId)
				.when()
				.post(Cart_Resource.addItemResource());
		
		statusCode=response.getStatusCode();
		responseString=response.asString();
		
		if(statusCode==200) {
							 
			log.info("add item to basket successfull");
			log.info(responseString);
			Reporter.log("add item to basket successfull");
			Reporter.log(responseString);
			basketId=response.getBody().jsonPath().get("basket_id");
			etag = response.getHeader("ETag");
			System.out.println(basketId);
		}
		
		else{
			log.error("add item to basket failed");
			log.error(responseString);
			Reporter.log("add item to basket failed",false);
			Reporter.log(responseString,false);
			Reporter.getCurrentTestResult();
			Assert.fail("Test case fail");
		}
		
	}

}
