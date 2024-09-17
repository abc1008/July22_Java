package pageClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ExtentReportsHelper;


public class ChangePasswordPage {

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
	public ChangePasswordPage(WebDriver driver) {

		PageFactory.initElements(driver, this); // refers to nonstatic variables of current class.
	}

	// public method

	public void clickPassword()
	{
		buttonPassword.click();
	}
	

	public void enterNewPasswords()
	{
		textBoxPassword.sendKeys("Login@123");
		textBoxConirmPassword.sendKeys("Login@123");
	}
	

	public void clickContinue()
	{
		buttonContinue.click();
	}
	

	public void verifySuccessfulPasswordChange() throws InterruptedException
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
