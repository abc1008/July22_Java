package pack1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browser = "Chrome";
		
		if(browser.equals("Chrome"))
		{
			driver = new ChromeDriver();  // launch chrome browser
		}
		else if(browser.equals("Edge"))
		{
			driver = new  EdgeDriver();
		}
		else
		{
			System.out.println("Invalid browser");
		}
		
		driver.manage().window().maximize();   // method chaining - maximize method
		
		
		driver.get("https://www.google.com");  // hit url
		
		driver.navigate().to("https://www.facebook.com");   // hit url
		
		driver.navigate().back();   // back button of browser
		driver.navigate().forward();  // forward button of browser
		driver.navigate().refresh();   // refresh button of browser
		
		
		String title = driver.getTitle();   // to get the title of WebPage

		
		if(title.contains("Facebook"))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		
		System.out.println(driver.getCurrentUrl());   // returns the url of current window
		
		driver.quit();    // close browser
		driver.close();   // close the currently focused window.
		
	}
	
	
	

}
