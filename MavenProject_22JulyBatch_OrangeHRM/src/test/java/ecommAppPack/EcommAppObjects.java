package ecommAppPack;

import basePack.BaseClass;
import pageClasses.ChangePasswordPage;
import pageClasses.LoginPage;

public class EcommAppObjects extends BaseClass {

	private static ChangePasswordPage _changePasswordPage;
	public static ChangePasswordPage changePasswordPage() 
	{
		_changePasswordPage = new ChangePasswordPage(driver);
		
		return _changePasswordPage;
	}
	
	
	private static LoginPage _loginPage;
	public static LoginPage loginPage() 
	{
		_loginPage = new LoginPage(driver);
		
		return _loginPage;
	}
	
	
	
	
	
}
