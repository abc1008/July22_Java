package ecommAppPack;

import basePack.BaseClass;
import pageClasses.AddressBookPage;
import pageClasses.ChangePasswordPage;
import pageClasses.LoginPage;

public class EcommAppObjects extends BaseClass {

	private static ChangePasswordPage _changePasswordPage;
	public static ChangePasswordPage changePasswordPage() 
	{
		_changePasswordPage = new ChangePasswordPage(driver);
		
		return _changePasswordPage;
	}
	
	private static AddressBookPage _addressBookPage;
	public static AddressBookPage addressBookPage() 
	{
		_addressBookPage = new AddressBookPage(driver);
		
		return _addressBookPage;
	}
	
	private static LoginPage _loginPage;
	public static LoginPage loginPage() 
	{
		_loginPage = new LoginPage(driver);
		
		return _loginPage;
	}
	
	
	
	
	
}
