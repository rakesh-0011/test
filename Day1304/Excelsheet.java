package Day1304;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet 
{
		//FIle--->Workbook---->Sheet--->Row---->Cell
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("F:\\Selenium\\Selenium\\seleniumproject\\TestData\\RakeshSheet.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalrows = sheet.getLastRowNum();
		int totalcell = sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of rows" + totalrows);
		System.out.println("number of rows" + totalcell);

	}

}
