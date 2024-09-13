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


public class ChangePasswordPage {

	static WebDriver driver;
	// private variables : xpath and web-elements
	private final String buttonProfileIconByXpath = "//span[@class='oxd-userdropdown-tab']";
	private final String buttonChangePassByXpath = "//ul[@class='oxd-dropdown-menu']//a[text()='Change Password']";
	private final String textBoxPasswordByXpath = "(//input[@type='password'])[1]";
	private final String textBoxConfirmPassByXpath = "(//input[@type='password'])[2]";
	private final String textBoxConfirmPass2dByXpath = "(//input[@type='password'])[3]";
	private final String buttonSaveByXpath = "//button[text()=' Save ']";
	private final String msgSuccessByXpath = "//div[@id='oxd-toaster_1']";
	
	
	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;

	@FindBy(xpath = buttonProfileIconByXpath)
	private WebElement buttonProfileIcon;

	@FindBy(xpath = buttonChangePassByXpath)
	private WebElement buttonChangePass;

	@FindBy(xpath = textBoxConfirmPassByXpath)
	private WebElement textBoxConfirmPass;

	@FindBy(xpath = textBoxConfirmPass2dByXpath)
	private WebElement textBoxConfirmPass2;
	
	@FindBy(xpath = buttonSaveByXpath)
	private WebElement buttonSave;
	
	@FindBy(xpath = msgSuccessByXpath)
	private List<WebElement> msgSuccess;

	// public constructor
	public ChangePasswordPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); // refers to nonstatic variables of current class.
	}

	// public method
	public boolean resetPassword() throws IOException {

		boolean flag = true;

		buttonProfileIcon.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(buttonChangePass));
		
		buttonChangePass.click();
		textBoxPassword.sendKeys(ConfigHelper.getData("Password"));
		textBoxConfirmPass.sendKeys(ConfigHelper.getData("Password"));
		textBoxConfirmPass2.sendKeys(ConfigHelper.getData("Password"));
		
		buttonSave.click();

		if(msgSuccess.size() > 0)
		{
			ExtentReportsHelper.logPass("Password reset successful.");
		}
		else
		{
			ExtentReportsHelper.logFail("Password reset failed.");
			flag = false;
		}
		
		return flag;
	}

}
