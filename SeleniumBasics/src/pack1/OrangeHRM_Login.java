package pack1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM_Login {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		// enter user id
		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
		
		// enter password
		driver.findElement(By.xpath("//input[@name='password' or @placeholder='Passwuuord']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();   // profile icon
		
		
		WebElement changePass = driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//a[text()='Change Password']"));   
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(changePass));
		
		changePass.click();
		
		WebElement titleChangePass = driver.findElement(By.xpath("//h6[text()='Update Password']"));   
		
		wait.until(ExpectedConditions.visibilityOf(titleChangePass));
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("admin123");   // change password
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();   // Save click
		
		List<WebElement> successMsg = driver.findElements(By.xpath("//div[@id='oxd-toaster_1']"));   
		
		if(successMsg.size() > 0)
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		
		
		
		
		
		
	}
}
