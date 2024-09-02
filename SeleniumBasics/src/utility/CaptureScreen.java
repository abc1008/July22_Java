package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CaptureScreen {
	
	
	
	public static void printScreen(WebDriver driver, String fileName) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver;
		File screenShot = screen.getScreenshotAs(OutputType.FILE);
		File path = new File("D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_22July24_WEEKEND\\TestScreenShots\\"+fileName+".JPEG");
		Files.copy(screenShot, path);
	}
	
	
	

}
