package UdemyAssigments;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook excel = new XSSFWorkbook(System.getProperty("user.dir")+ "//src//test//java//Testdata.xlsx");
		
		//Creating New Sheet
		XSSFSheet NewSheet = excel.createSheet("LoginData");
		XSSFRow NewRows = NewSheet.createRow(0);
		XSSFCell NewCells = NewRows.createCell(0);
		NewCells.setCellValue("Online ID");
		FileOutputStream fos = new FileOutputStream(excel);
		
		//Writing Values into New Sheet
		
		
		
		//Reading Values from Excel
		XSSFSheet Sheet = excel.getSheet("Facebook");
		XSSFRow Row = Sheet.getRow(1);
		XSSFCell Column = Row.getCell(1);		
		System.out.println("Value in column is:" + Column);
		
		
		
	}

}
