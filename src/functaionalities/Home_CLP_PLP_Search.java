package functaionalities;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import generalUtilities.BaseTest;
import groovy.util.logging.Log;
import groovy.util.logging.Log4j;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import resources.Home_CLP_PLP_Search_Resource;

public class Home_CLP_PLP_Search extends BaseTest {
	
	

	
	public static void contentMethod() throws IOException{
		
		BaseTest.Home_CLP_PLP_Search_data();
		System.out.println("contentMethod() start");
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.pathParam("id", id)
				
				.when()
				.get(Home_CLP_PLP_Search_Resource.content());
		
		 statusCode = response.getStatusCode();
		 responseString = response.body().asString();
		
		if(statusCode==200){
			System.out.println("Contents fetched successfully");
			System.out.println(responseString);
			log.info("Contents fetched successfully");
			log.info(responseString);
			Reporter.log(responseString,true);
		}
		
		else{
			System.out.println("content fetching failed");
			System.out.println(responseString);
			log.error("content fetching failed");
			log.error(responseString);
		}
		
		
		
	}
	
	public static void categoryLists() throws IOException {
		BaseTest.Home_CLP_PLP_Search_data();
		System.out.println("categoryLists start");
		response=
				given()
				.queryParam("client_id", "0531126e-272d-462a-b967-e25abdf45bbc")
				.header("Origin","https://www.dummyapi.com")
				.header("Content-Type","application/json")
				.pathParam("id", CategoryID)
				.when()
				.get(Home_CLP_PLP_Search_Resource.categoryListsResource());
		
		statusCode=response.getStatusCode();
		responseString=response.asString();
		
		if(statusCode==200) {
			
			/*
			 * System.out.println("Category listed successfully");
			 * System.out.println(responseString);
			 */
			 
			log.info("Category listed successfully");
			log.info(responseString);
			Reporter.log("Category listed successfully");
			Reporter.log(responseString);
		}
		
		else{
			log.error("Category listed failed");
			log.error(responseString);
			Reporter.log("Category listed failed",false);
			Reporter.log(responseString,false);
			Reporter.getCurrentTestResult();
			Assert.fail("Test case fail");
		}
		
	}
	
	
	
}
