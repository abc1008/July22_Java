package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.JSMethods;

public class JavsScriptMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formstone.it/components/checkbox/");
		Thread.sleep(3000);
		
		WebElement demo = driver.findElement(By.xpath("//h2[text()=' Demo']"));
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;  // typecasting
//		js.executeScript("arguments[0].scrollIntoView();", demo);
		
		JSMethods.scrollTo(driver, demo);
		
		Thread.sleep(2000);
		
		
		
		// correct click 
//		WebElement chkbx = driver.findElement(By.xpath("//input[@id='checkbox-1']//..//..//div[contains(@class,'fs-checkbox-marker')]"));
//		chkbx.click();
		
		
		
		WebElement chkbx = driver.findElement(By.xpath("//input[@id='checkbox-1']"));
//		js.executeScript("arguments[0].click();", chkbx);  // javascript click
		JSMethods.javasciptClick(driver, chkbx);
		

	}

}
