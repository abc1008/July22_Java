package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling2 {

	public static void main(String[] args) throws IOException {

		String path = "D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_22July24_WEEKEND\\Excel File.xlsx";

		FileInputStream file = new FileInputStream(path); // to let java know which file to handle

		XSSFWorkbook wb = new XSSFWorkbook(file); // load/open the file
		XSSFSheet sheet = wb.getSheet("ReadData"); // opening the sheet

		
		System.out.println("***** For Loop *****");
		double phone = 0.0;
		
		for (int r = 1; r <= 3; r++) 
		{
			for (int c = 0; c <= 2; c++) 
			{
				XSSFRow row = sheet.getRow(r); // get the row
				XSSFCell cell = row.getCell(c); // get the cell
				
				if(c == 2)
				{
					phone = cell.getNumericCellValue();
					System.out.print(phone + " ");
				}
				else
				{
					String data = cell.getStringCellValue(); // get the data
					System.out.print(data + " ");
				}
			}
			
			System.out.println();

		}



	}

}
