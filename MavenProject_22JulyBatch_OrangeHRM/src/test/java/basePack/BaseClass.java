package basePack;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import testScripts.LoginTestScript;
import utility.ConfigHelper;
import utility.ExtentReportsHelper;

public class BaseClass {

	public static WebDriver driver;
	public static String dateTimeStamp;

	@BeforeSuite
	public void executionInitialization() 
	{
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("ddMMyyyy_HH_mm_ss");
		dateTimeStamp = time.format(dateFormat);
	}

	@BeforeMethod
	public void Login() throws IOException 
	{
		String browser = ConfigHelper.getData("BrowserType");

		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else
			System.out.println("Incorrect Browser");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(ConfigHelper.getData("TestSiteUrl"));

		ExtentReportsHelper extentReportsHelper = new ExtentReportsHelper(driver, dateTimeStamp);
		ExtentReportsHelper.StartTest();
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.performLogin();
		

	}

	@AfterMethod
	public void Logout() {
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.performLogout();

		ExtentReportsHelper.endTest();

		driver.quit();
	}

}
