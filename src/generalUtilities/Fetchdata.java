package generalUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetchdata {
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
				System.out.println(workbook.getSheetName(i));
				XSSFSheet sheet=workbook.getSheetAt(i);
				for(int j=0;j<=sheet.getLastRowNum();j++)
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
		System.out.println("printing excel data");
		System.out.println("aaa");
		System.out.println(a);
		workbook.close();
		return a;	
		
	}
}
