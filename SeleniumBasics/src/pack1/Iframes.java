package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		Thread.sleep(3000);
		WebElement text3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		text3.sendKeys("abcd");
		
		driver.switchTo().defaultContent();  //selenium focus to main frame
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		
		Thread.sleep(3000);
		WebElement text4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		text4.sendKeys("abcd");
		
		
		
		
//		 ************ 
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame3);
		
		
		WebElement innerIframe = driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(innerIframe);
		
		Thread.sleep(2000);
		WebElement radioButton = driver.findElement(By.xpath("//div[@id='i8']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", radioButton);
		
		Thread.sleep(3000);
		radioButton.click();
		
		driver.switchTo().parentFrame();  // switch to immediate parent
		
		
		Thread.sleep(3000);
		text3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		text3.sendKeys("qwerty");
		
		
		
		
		
		
	}

}
