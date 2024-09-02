package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		
		WebElement openAlert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		openAlert.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	
		Thread.sleep(2000);
//		driver.switchTo().alert().accept();   // OK
		
		driver.switchTo().alert().dismiss();   // Cancel
		
		
	}

}
