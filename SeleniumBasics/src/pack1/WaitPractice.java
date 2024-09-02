package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.JSMethods;

public class WaitPractice {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

		
		WebElement butnClick = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		JSMethods.scrollTo(driver, butnClick);
		
		butnClick.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(250))  // polling frequency
				.ignoring(NullPointerException.class);
		
		
		wait.until(ExpectedConditions.alertIsPresent());
				
		driver.switchTo().alert().accept();
		
		System.out.println("End");
		
		
		
	}
	
	
	
	
	

}
