package functaionalities;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;

import com.jayway.jsonpath.spi.json.GsonJsonProvider;

import generalUtilities.BaseTest;
import io.restassured.path.json.JsonPath;
import net.minidev.json.JSONObject;
import payloads.Checkout_Payloads;
import resources.Cart_Resource;
import resources.Checkout_Resource;

public class Checkout extends BaseTest {
	public static void checkoutShippingAddress() throws IOException {

		
		System.out.println("shipping address start");
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.header("Authorization",auth)
				.header("If-Match",etag)
				.body("{\r\n" + 
						"\"first_name\":\"John\",\r\n" + 
						"\"last_name\":\"Smith\",\r\n" + 
						"\"city\":\"Boston\",\r\n" + 
						"\"country_code\":\"US\",\r\n" + 
						"\"state_code\": \"Alaska\",\r\n" + 
						"\"postal_code\":\"02101\",\r\n" + 
						"\"phone\":\"3333333333\",\r\n" + 
						"\"address1\":\"1 Microsoft way\",\r\n" + 
						"\"country_code\":\"US\"\r\n" + 
						
						"}")
				.pathParam("basket_id", basketId)
				.when()
				.put(Checkout_Resource.shippingAddressResource());
		responseString=response.asString();
		 jPath = new JsonPath(responseString);
		statusCode=response.getStatusCode();
		responseString=response.asString();
		
		if(statusCode==200) {
							 
			log.info("shipping address added successfully");
			log.info(responseString);
			Reporter.log("shipping address added successfully");
			Reporter.log(responseString);
		}
		
		else{
			log.error("adding shipping address failed");
			log.error(responseString);
			Reporter.log("adding shipping address failed",false);
			Reporter.log(responseString,false);
			Reporter.getCurrentTestResult();
			Assert.fail("Test case fail");
		}
}
	
	
	public static void addCustomeremail() throws IOException {

		
		System.out.println("add customer email start");
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.header("Authorization",auth)
				.body("{\r\n" + 
						"  \"email\":\"valid@email.com\"\r\n" + 
						"}")
				.pathParam("basket_id", basketId)
				.when()
				.put(Checkout_Resource.addEmailResource());
		responseString=response.asString();
		 jPath = new JsonPath(responseString);
		statusCode=response.getStatusCode();
		responseString=response.asString();
		
		if(statusCode==200) {
							 
			log.info("customer email added successfully");
			log.info(responseString);
			Reporter.log("customer email added successfully");
			Reporter.log(responseString);
		}
		
		else{
			log.error("customer email address adding failed");
			log.error(responseString);
			Reporter.log("customer email adding failed",false);
			Reporter.log(responseString,false);
			Reporter.getCurrentTestResult();
			Assert.fail("Test case fail");
		}
}
	public static void addShippingMethod() throws IOException {

		
		System.out.println("add shipping method start");
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.header("Authorization",auth)
				.body("{\r\n" + 
						"  \"id\":\"001\"\r\n" + 
						"}")
				.pathParam("basket_id", basketId)
				.when()
				.put(Checkout_Resource.shippingMethodResource());
		responseString=response.asString();
		 jPath = new JsonPath(responseString);
		statusCode=response.getStatusCode();
		responseString=response.asString();
		
		if(statusCode==200) {
							 
			log.info("shipping method added successfully");
			log.info(responseString);
			Reporter.log("shipping method added successfully");
			Reporter.log(responseString);
		}
		
		else{
			log.error("adding shipping method failed");
			log.error(responseString);
			Reporter.log("adding shipping method failed",false);
			Reporter.log(responseString,false);
			Reporter.getCurrentTestResult();
			Assert.fail("Test case fail");
		}
}
	
	public static void addBillingAddress() throws IOException {

		
		System.out.println("add billing address start");
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.header("Authorization",auth)
				.body("{\r\n" + 
						"\"first_name\":\"John\",\r\n" + 
						"\"last_name\":\"Smith\",\r\n" + 
						"\"city\":\"Boston\",\r\n" + 
						"\"country_code\":\"US\",\r\n" + 
						"\"state_code\": \"Alaska\",\r\n" + 
						"\"postal_code\":\"11122\",\r\n" + 
						"\"phone\":\"3333333333\",\r\n" + 
						"\"address1\":\"1 Microsoft way\",\r\n" + 
						"\"country_code\":\"US\"\r\n" + 
						"}")
				.pathParam("basket_id", basketId)
				.when()
				.put(Checkout_Resource.billingAddressResource());
		responseString=response.asString();
		 jPath = new JsonPath(responseString);
		statusCode=response.getStatusCode();
		responseString=response.asString();
		
		if(statusCode==200) {
							 
			log.info("billing address added successfully");
			log.info(responseString);
			Reporter.log("billing address added successfully");
			Reporter.log(responseString);
		}
		
		else{
			log.error("adding billing address failed");
			log.error(responseString);
			Reporter.log("adding billing address failed",false);
			Reporter.log(responseString,false);
			Reporter.getCurrentTestResult();
			Assert.fail("Test case fail");
		}
}
	
	public static void addPayment() throws IOException {

	
		System.out.println("add payment start");
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.header("Authorization",auth)
				.body("{\r\n" + 
						"  \"amount\" : 1.0,\r\n" + 
						"  \"payment_card\" : {\r\n" + 
						"                     \"number\":\"411111111111111\",\r\n" + 
						"                     \"security_code\":\"121\",\r\n" + 
						"                     \"holder\":\"John Doe\",\r\n" + 
						"                     \"card_type\":\"Visa\",\r\n" + 
						"                     \"expiration_month\":1,\r\n" + 
						"                     \"expiration_year\":2021\r\n" + 
						"                    },\r\n" + 
						"  \"payment_method_id\" : \"CREDIT_CARD\"\r\n" + 
						"}")
				.pathParam("basket_id", basketId)
				.when()
				.post(Checkout_Resource.paymentResource());
		responseString=response.asString();
		 jPath = new JsonPath(responseString);
		statusCode=response.getStatusCode();
		responseString=response.asString();
		
		if(statusCode==200) {
							 
			log.info("Payment method added successfully");
			log.info(responseString);
			Reporter.log("Payment method added successfully");
			Reporter.log(responseString);
		}
		
		else{
			log.error("adding Payment method failed");
			log.error(responseString);
			Reporter.log("adding Payment method failed",false);
			Reporter.log(responseString,false);
			Reporter.getCurrentTestResult();
			Assert.fail("Test case fail");
		}
}
	
	public static void placeOrder() throws IOException {

		
		System.out.println("place order start");
		JSONObject abc = new JSONObject();
		
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.header("Authorization",auth)
				.body(Checkout_Payloads.placeOrderPayload())
				.when()
				.post(Checkout_Resource.placeOrderResource());
		responseString=response.asString();
		 jPath = new JsonPath(responseString);
		statusCode=response.getStatusCode();
		responseString=response.asString();
		
		if(statusCode==200) {
							 
			log.info("Order placed successfully");
			log.info(responseString);
			Reporter.log("Order placed  successfully");
			Reporter.log(responseString);
		}
		
		else{
			log.error("Order placement failed");
			log.error(responseString);
			Reporter.log("Order placement failed",false);
			Reporter.log(responseString,false);
			Reporter.getCurrentTestResult();
			Assert.fail("Test case fail");
		}
}
}
