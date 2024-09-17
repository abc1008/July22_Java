package pageClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ConfigHelper;
import utility.ExtentReportsHelper;

public class POMChangePassPage {
	
	// private variables : xpath and web-elements
	private final String textBoxPasswordByXpath = "//input[@id='input-password']";
	private final String textBoxConirmPasswordByXpath = "//input[@id='input-confirm']";
	private final String buttonContinueByXpath = "//input[@type='submit']";
	private final String buttonPasswordByXpath = "//a[text()='Password']";
	private final String successMsgByXpath = "//div[contains(@class,'alert-success')]";

	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;

	@FindBy(xpath = textBoxConirmPasswordByXpath)
	private WebElement textBoxConirmPassword;

	@FindBy(xpath = buttonContinueByXpath)
	private WebElement buttonContinue;

	@FindBy(xpath = buttonPasswordByXpath)
	private WebElement buttonPassword;

	@FindBy(xpath = successMsgByXpath)
	private WebElement successMsg;

	// public constructor
	public POMChangePassPage(WebDriver driver) {

		PageFactory.initElements(driver, this); // refers to nonstatic variables of current class.
	}

	// public method
	
	public void clickPasswordButton()
	{
		buttonPassword.click();
	}
	
	public void enterNewPassword()
	{
		textBoxPassword.sendKeys("Login@123");
		textBoxConirmPassword.sendKeys("Login@123");
	}
	
	public void hitContinueButton()
	{
		buttonContinue.click();
	}
	
	public void verifySuccessfulPassChange() throws IOException
	{
		String textonUI = successMsg.getText();
		System.out.println("textonUI : "+ textonUI);

		if (textonUI.contains("Your passworduuu has been successfully updated")) 
		{
			System.out.println("Password Reset Successful.");
		} 
		else 
		{
			System.out.println("Password Reset Failed.");
		}
	}
	



	

}
