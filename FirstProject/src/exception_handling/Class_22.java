package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_22 {
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException{
		
		System.out.println("Before FileInputStream line");
		
		FileInputStream file = new FileInputStream("D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_22July24_WEEKEND\\Excel Fi.xlsx");
		
		
		Thread.sleep(5000);  // stop program execution for given time
		

		System.out.println("After FileInputStream line");
		
		
		
		

		
		
	}
	
	
	
	
	
	
	

}
