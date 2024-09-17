package basepack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.ConfigHelper;

public class BaseClass {
	
	public static WebDriver driver;

	public static void testSetup() throws InterruptedException, IOException
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
	
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys(ConfigHelper.getData("UserId"));

		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(ConfigHelper.getData("Password"));
	
		Thread.sleep(2000);
		// Locate webelement and perform the operation
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

	public static void tearDown()
	{
		driver.quit();
	}

}
