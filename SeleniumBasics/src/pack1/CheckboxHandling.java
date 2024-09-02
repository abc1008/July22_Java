package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://practice.expandtesting.com/checkboxes");
		
		driver.get("https://formstone.it/components/checkbox/");
		Thread.sleep(3000);
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='radio-1']"));
		boolean result = radio1.isSelected();
		
		System.out.println(result);
		
		if(result == false)
		{
			System.out.println("Given checkbox is not Selected.");
		}
		else
		{
			System.out.println("Given checkbox is Selected.");
		}
		
	   
	   
	   
	   
	   
	   
	   
		
		
		
		
		
//		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
	}
	
//	

}
