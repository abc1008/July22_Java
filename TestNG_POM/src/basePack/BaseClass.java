package basePack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import testScripts.LoginTestScript;
import utility.ConfigReader;

public class BaseClass {
	
	public static WebDriver driver;

	
	@BeforeMethod
	public void Login() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(ConfigReader.getData("TestSiteUrl"));
		
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.performLogin();
	}
	
	@AfterMethod
	public void Logout()
	{
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.performLogout();
		
		driver.quit();
	}
	

	
	

}
