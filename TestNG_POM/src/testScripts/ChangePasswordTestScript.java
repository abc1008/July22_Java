package testScripts;

import basePack.BaseClass;
import pageClasses.ChangePasswordPage;

public class ChangePasswordTestScript extends BaseClass {
	
	
	public void performChangePassword()
	{
		ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver);
		changePasswordPage.resetPassword();
	}

}
