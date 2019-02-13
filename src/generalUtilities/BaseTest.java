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
	



	public static ArrayList<String> excelData(String path, String sheetName, String Scenario) throws IOException
	{
		ArrayList<String> a= new ArrayList<String>();
	
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase(sheetName))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				for(int j=0;j<sheet.getLastRowNum();j++)
				{
					System.out.println(sheet.getLastRowNum());
					Row excelRows = sheet.getRow(j);
					if(excelRows.getCell(0).getStringCellValue().equalsIgnoreCase(Scenario))
					{
						for(int k=0;k<excelRows.getLastCellNum();k++)
						{
						Cell cellValue = excelRows.getCell(k);
							if(cellValue == null)
							{
								break;
							}
							else if(cellValue.getCellTypeEnum()==CellType.STRING)
							{
								
								a.add(cellValue.getStringCellValue());
								
							}	
							else if(cellValue.getCellType()==CellType.NUMERIC)
							{
								
								a.add(NumberToTextConverter.toText(cellValue.getNumericCellValue()));
								
							}
							
							else
							{
								
								a.add(Boolean.toString(cellValue.getBooleanCellValue()));
								
							}
						}
					}
				}
			}
		}
		workbook.close();
		return a;		
	}

public static  void Home_CLP_PLP_Search_data() throws IOException{
	
	ArrayList<String> data = excelData("//src//data//data.xlsx", "Home_CLP_PLP_Search", "Scenario1");
	id=data.get(1);
	
	
	
}

}

