package utility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import basePack.BaseClass;

public class ExtentReportsHelper extends BaseClass {
	
	static ExtentReports extentReports;
	static ExtentTest extentTest;
	
	public ExtentReportsHelper()
	{
		extentReports = new ExtentReports(); // main class
		
		String projectPath = System.getProperty("user.dir");
		String reportPath = projectPath + "\\TestResults\\TestReport_"+dateTimeStamp+".html";

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
		extentReports.attachReporter(htmlReporter);
	}
	
	public static void StartTest()
	{
		 extentTest = extentReports.createTest("TestCase_1");
	}
	
	public static void logPass(String message)
	{
		extentTest.log(Status.PASS, message);
	}
	
	public static void logFail(String message) throws IOException
	{
		extentTest.log(Status.FAIL, message, printScreen(driver,"TestScreenShot"));
	}
	
	public static void logInfo(String message)
	{
		extentTest.log(Status.INFO, message);
	}
	
	public static void endTest()
	{
		extentReports.flush();
	}
	
	
	public static Media printScreen(WebDriver driver, String fileName) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver;
		String screenShot = screen.getScreenshotAs(OutputType.BASE64);
		
		return MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot).build();
		
	}
	
	
	
}
