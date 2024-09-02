package pack1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import utility.CaptureScreen;

public class PerformLogin {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		Thread.sleep(3000);

		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("ag89111@gmail.com");

		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Login@123");

		Thread.sleep(2000);
		// Locate webelement and perform the operation
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
//		Logout
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();   
		
		
		List<WebElement> logoutMsg = driver.findElements(By.xpath("//title[text()='Account Logou']"));
		
		
		if(logoutMsg.size() > 0)
		{
			System.out.println("logout successful");
		}
		else
		{
			System.out.println("failed to logout");
			
			// Take Screenshot
//			TakesScreenshot screen = (TakesScreenshot)driver;
//			File screenShot = screen.getScreenshotAs(OutputType.FILE);
//			File path = new File("D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_22July24_WEEKEND\\TestScreenShots\\FailedScreenshot.JPEG");
//			Files.copy(screenShot, path);
			
//			String ssName = "File1" + dateTime;
			
			CaptureScreen.printScreen(driver, "File1");
			
			
//			Scrolling
			
			
		}
		
		
		


		
		
		
		

	}

}
