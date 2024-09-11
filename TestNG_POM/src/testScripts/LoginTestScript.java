package testScripts;

import java.io.IOException;
import basePack.BaseClass;
import ecommAppPack.EcommAppObjects;
import pageClasses.LoginPage;


public class LoginTestScript extends BaseClass
{
	
	public void performLogin() throws IOException
	{
		EcommAppObjects.loginPage().login();
	}

	
	
	public void performLogout()
	{
		EcommAppObjects.loginPage().logout();
	}
	
	
	
}
