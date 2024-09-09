package testScripts;

import java.io.IOException;
import basePack.BaseClass;
import pageClasses.LoginPage;


public class LoginTestScript extends BaseClass
{
	
	public void performLogin() throws IOException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}

	
	
	public void performLogout()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.logout();
	}
	
	
	
}
