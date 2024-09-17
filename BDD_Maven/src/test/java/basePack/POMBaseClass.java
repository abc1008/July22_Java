package basePack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import ecommAppPack.EcommAppObjects;
import utility.ConfigHelper;

public class POMBaseClass {

	public static WebDriver driver;

	public static void initializeDriver() throws IOException {
		if (driver == null) {

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
			EcommAppObjects.pomLoginPage().enterCredentials();
			EcommAppObjects.pomLoginPage().hitLogin();
			
			
			

		}
	}

	public static void closeDriver() {
		
		EcommAppObjects.pomLoginPage().logout();
		
		
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
