package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		
		Thread.sleep(3000);
		
		WebElement dayDropdown = driver.findElement(By.xpath("//select[@id='day']"));
		dayDropdown.click();
		
		Thread.sleep(2000);
		
		// storing all options from dropdown 
		List<WebElement> allDays = driver.findElements(By.xpath("//select[@id='day']//option"));
		
		
		// iterate over all options and print text from each option 
		for( WebElement day : allDays)
		{
			String dayNum =  day.getText(); // get the text from each dropdown option
			System.out.println(dayNum);  // print text
			
			if(dayNum.equals("10"))
			{
				day.click();
				break;
			}
		}
		
		System.out.println("After for loop");
		
		Thread.sleep(2000);
		
		
		
 		WebElement monthDropdown = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sel = new Select(monthDropdown);
//		sel.selectByIndex(5);
		
//		sel.selectByValue("10");   // value attribute in dom
		
		sel.selectByVisibleText("Apr");
		
	}
	
	

}
