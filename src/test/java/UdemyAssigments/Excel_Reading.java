package UdemyAssigments;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reading {

	public static void main(String[] args) throws IOException {
		
		String sheetname="";
		
		XSSFWorkbook excel = new XSSFWorkbook(System.getProperty("user.dir") + "//src//test//java//Testdata.xlsx");
		int sheetcount = excel.getNumberOfSheets();
		
		System.out.println("Sheets names:");
		for(int i=0; i<sheetcount; i++)
		{
			sheetname = excel.getSheetName(i);
			System.out.println(sheetname);
		}
		
		if(sheetname.equalsIgnoreCase("Google Search"))
		{
			XSSFSheet Sheet = excel.getSheet("Google Search");
			int rows = Sheet.getPhysicalNumberOfRows();
			System.out.println("Number of Rows" + rows);
			System.out.println("Content in Rows are:");
			for(int i=0; i<rows; i++)
			{
				List<XSSFTable> RowContent = Sheet.getTables();
				RowContent.addAll(0, RowContent);
				Iterator<XSSFTable> iter = RowContent.iterator();
				while(iter.hasNext())
				{
					System.out.println();
					RowContent.get(0);
				}
			}
			
		}

	}

}
