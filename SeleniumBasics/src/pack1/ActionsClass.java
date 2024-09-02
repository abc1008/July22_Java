package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://practice.expandtesting.com/checkboxes");
		
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
//		hover : moveToElement
		
		WebElement mp3Player = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		act.moveToElement(mp3Player).perform();
		
		Thread.sleep(2000);
		WebElement showAllMp3Player = driver.findElement(By.xpath("//a[text()='Show AllMP3 Players']"));
		act.click(showAllMp3Player).perform();
		
		
	}
	
	
	
	
	

}
