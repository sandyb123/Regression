package Testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import functaionalities.Home_CLP_PLP_Search;
import generalUtilities.BaseTest;
import io.restassured.RestAssured;


public class RegressionTest extends BaseTest {

	@BeforeTest
	public static void hitClientResource(){
		RestAssured.baseURI="https://development-abh-anastasiabeverlyhills.demandware.net";
		RestAssured.basePath="/s/AnastasiaUS/dw/shop/v18_8";
		System.out.println("programme start");
		
	}
	
	@BeforeTest
	public static void getExcel(){
		
	}
	
	@Test (priority=2)
	public void regression_Content() throws IOException{
	Home_CLP_PLP_Search.contentMethod();
	}
	
	@Test (priority=1)
	public void regression_CategoryLists() throws IOException {
		Home_CLP_PLP_Search.categoryLists();
	}
}
