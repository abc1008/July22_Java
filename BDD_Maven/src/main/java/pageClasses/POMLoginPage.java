package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ConfigHelper;
import utility.ExtentReportsHelper;

public class POMLoginPage {
	
	// private variables : xpath and web-elements
	private final String textBoxEmailAddrByXpath = "//input[@id='input-email']";
	private final String textBoxPasswordByXpath = "//input[@id='input-password']";
	private final String buttonLoginByXpath = "//input[@value='Login']";
	private final String buttonMyAccountByXpath = "//span[text()='My Account']";
	private final String buttonLogoutByXpath = "//ul//a[text()='Logout']";
	private final String msgLogoutConfirmByXpath = "//p[contains(text(),'You have been logged off your account.')]";
	private final String buttonLoginFromDropdownByXpath = "//a[text()='Login']";
	
	
	@FindBy(xpath = textBoxEmailAddrByXpath)
	private WebElement textBoxEmailAddr;

	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;

	@FindBy(xpath = buttonLoginByXpath)
	private WebElement buttonLogin;

	@FindBy(xpath = buttonMyAccountByXpath)
	private WebElement buttonMyAccount;

	@FindBy(xpath = buttonLogoutByXpath)
	private WebElement buttonLogout;

	@FindBy(xpath = msgLogoutConfirmByXpath)
	private WebElement msgLogoutConfirm;
	
	@FindBy(xpath = buttonLoginFromDropdownByXpath)
	private WebElement buttonLoginFromDropdown;

	// public constructor
	public POMLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this); // refers to nonstatic variables of current class.
	}
	

	public void enterCredentials() throws IOException {
		
		textBoxEmailAddr.sendKeys(ConfigHelper.getData("UserId"));
		textBoxPassword.sendKeys(ConfigHelper.getData("Password"));
	}
	
	
	// public method
	public void hitLogin() throws IOException {
	
		buttonLogin.click();
//		ExtentReportsHelper.logPass("Login Successful");
		System.out.println("Login Successful");
	}

	public void logout()
	{
		buttonMyAccount.click();
		buttonLogout.click();
		System.out.println();
		
//		ExtentReportsHelper.logPass("Logout Successful");
		
		System.out.println("Logout Successful");

	}


}
