package ecommAppPack;

import pageClasses.ChangePasswordPage;
import pageClasses.LoginPage;

public class EcommAppObjects extends basepack.BaseClass {

	private static ChangePasswordPage _changePasswordPage;
	public static ChangePasswordPage changePasswordPage() 
	{
		_changePasswordPage = new ChangePasswordPage(driver);
		
		return _changePasswordPage;
	}
	
	
	
	
	
	
}
