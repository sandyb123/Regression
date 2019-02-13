package functaionalities;

import static io.restassured.RestAssured.given;

import java.io.IOException;

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
		}
		
		else{
			System.out.println("content fetching failed");
			System.out.println(responseString);
			log.error("content fetching failed");
			log.error(responseString);
		}
		
		
	}
}
