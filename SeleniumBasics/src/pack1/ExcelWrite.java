package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException {
		
		
		String path = "D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_22July24_WEEKEND\\Excel File.xlsx";
		
		FileInputStream file = new FileInputStream(path); // to let java know which file to read
		
		XSSFWorkbook wb = new  XSSFWorkbook(file); // load/open the file
		XSSFSheet sheet = wb.getSheet("ReadData"); // opening the sheet
		
		FileOutputStream fOut = new FileOutputStream(path);
		
		XSSFRow row2 = sheet.getRow(3); // get the row
		XSSFCell cell2 = row2.getCell(1); // get the cell
		
		cell2.setCellValue("Edit Cell2");   // set the cell value
		wb.write(fOut);
		
		wb.close();
		
		System.out.println("Completed");
		
		
		
	}
	
	
	
	
	
	

}
