package pack1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("mainWindowHandle : " + mainWindowHandle);
		
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		System.out.println();
		
		Set<String> allWinds = driver.getWindowHandles();
		
		
		System.out.println();
		System.out.println("Windows using Set");
		System.out.println();
		
		for( String win : allWinds)
		{
			System.out.println(win);
			
//			if(!(win.equals(mainWindowHandle)))
//			{
//				driver.switchTo().window(win);
//			}
		}
		
		
		System.out.println();
		System.out.println("Windows using ArrayList");
		System.out.println();
		
		
		ArrayList<String> windowList = new ArrayList<String>(allWinds);
		
		System.out.println(windowList.get(0));
		System.out.println(windowList.get(1));
		System.out.println(windowList.get(2));
		System.out.println(windowList.get(3));
		
		driver.switchTo().window(windowList.get(2));
		
		System.out.println();
		String switchedToWindow = driver.getWindowHandle();
		System.out.println("switchedToWindow : " + switchedToWindow);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("abcd");
	}

}
