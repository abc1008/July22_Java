package basePack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import testScripts.LoginTestScript;
import utility.ConfigHelper;

public class BaseClass {
	
	public static WebDriver driver;

	
	@BeforeMethod
	public void Login() throws IOException
	{
		String browser = ConfigHelper.getData("BrowserType");
		
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else
			System.out.println("Incorrect Browser");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(ConfigHelper.getData("TestSiteUrl"));
		
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
