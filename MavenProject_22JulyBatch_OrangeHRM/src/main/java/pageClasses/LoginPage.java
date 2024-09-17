package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ConfigHelper;
import utility.ExtentReportsHelper;


public class LoginPage {


	// private variables : xpath and web-elements
	private final String textBoxUserIDByXpath = "//input[@name='username']";
	private final String textBoxPasswordByXpath = "//input[@name='password' or @placeholder='Passwuuord']";
	private final String buttonLoginByXpath = "//button[@type='submit']";
	private final String buttonProfileIconByXpath = "//span[@class='oxd-userdropdown-tab']";
	private final String buttonLogoutByXpath = "//a[text()='Logout']";
	
	
	@FindBy(xpath = textBoxUserIDByXpath)
	private WebElement textBoxUserID;

	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;

	@FindBy(xpath = buttonLoginByXpath)
	private WebElement buttonLogin;

	@FindBy(xpath = buttonProfileIconByXpath)
	private WebElement buttonProfileIcon;

	@FindBy(xpath = buttonLogoutByXpath)
	private WebElement buttonLogout;


	// public constructor
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this); // refers to nonstatic variables of current class.
	}

	// public method
	public void login() throws IOException {
	
		textBoxUserID.sendKeys(ConfigHelper.getData("UserId"));
		textBoxPassword.sendKeys(ConfigHelper.getData("Password"));
		buttonLogin.click();
		
		ExtentReportsHelper.logPass("Login Successful");
		

	}

	public void logout()
	{
		buttonProfileIcon.click();
		buttonLogout.click();
		System.out.println();
		
		ExtentReportsHelper.logPass("Logout Successful");

	}

}
