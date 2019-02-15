package generalUtilities;

import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.logging.LogManager;


import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;

import Testcase.RegressionTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class BaseTest {
	
	
	public static ArrayList<String> a;
	public static Response response;
	public static RequestSpecification request;
	public static String responseString;
	public static int statusCode;
	public static String id;
	public static Logger log=org.apache.logging.log4j.LogManager.getLogger(RegressionTest.class);
	



	

public static  void Home_CLP_PLP_Search_data() throws IOException{
	
	System.out.println("printing Home_CLP_PLP_Search_data() ");
	ArrayList<String> data = Fetchdata.excelData("//src//data//data.xlsx", "Home_CLP_PLP_Search", "Scenario1");
	id=data.get(1);
	
	
	
}

}

