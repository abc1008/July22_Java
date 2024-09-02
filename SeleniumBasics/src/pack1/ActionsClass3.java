package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(3000);
		
		WebElement userId = driver.findElement(By.xpath("//input[@id='input-email']"));
		userId.sendKeys("ag89111@gmail.com");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("Login@123");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		
	}
	
	
	
	
	

}
