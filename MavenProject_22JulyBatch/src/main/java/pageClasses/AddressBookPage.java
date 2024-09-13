package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBookPage {
	
	
	// private variables : xpath and web-elements // object repository
	private final String buttonAddrBookByXpath = "//a[text()='Address Book']";
	private final String buttonEditByXpath = "//a[text()='Edit']";
	private final String textBoxAddr1ByXpath = "//input[@id='input-address-1']";
	private final String textBoxAddr2ByXpath = "//input[@id='input-address-2']";
	private final String buttonContinueByXpath = "//input[@type='submit']";

	@FindBy(xpath = buttonAddrBookByXpath)
	private WebElement buttonAddrBook;

	@FindBy(xpath = buttonEditByXpath)
	private WebElement buttonEdit;
	
	@FindBy(xpath = textBoxAddr1ByXpath)
	private WebElement textBoxAddr1;
	
	@FindBy(xpath = textBoxAddr2ByXpath)
	private WebElement textBoxAddr2;
	
	@FindBy(xpath = buttonContinueByXpath)
	private WebElement buttonContinue;
	

	// public constructor
	public AddressBookPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this); // refers to nonstatic variables of current class.
	}

	// public method
	public void changeAddress(){
	
		buttonAddrBook.click();
		buttonEdit.click();
		textBoxAddr1.sendKeys("abc");
		textBoxAddr2.sendKeys("xyz");
		buttonContinue.click();
		
		System.out.println("Change Address Successful");

	}


}
