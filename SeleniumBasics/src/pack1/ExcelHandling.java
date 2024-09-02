package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		String path = "D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_22July24_WEEKEND\\Excel File.xlsx";
		
		FileInputStream file = new FileInputStream(path); // to let java know which file to handle
		
		XSSFWorkbook wb = new  XSSFWorkbook(file); // load/open the file
		XSSFSheet sheet = wb.getSheet("ReadData"); // opening the sheet
		XSSFRow row = sheet.getRow(2); // get the row
		XSSFCell cell = row.getCell(0); // get the cell
		String data = cell.getStringCellValue();  // get the data
		System.out.println(data);
		
		
		XSSFRow row2 = sheet.getRow(3); // get the row
		XSSFCell cell2 = row2.getCell(1); // get the cell
		double data2 = cell2.getNumericCellValue();
		System.out.println(data2);
		
		
	}
	
	
	
	
	
	

}
