package testScripts;

import basePack.BaseClass;
import pageClasses.ChangePasswordPage;

public class ChangePasswordTestScript extends BaseClass {

	public boolean performChangePassword() 
	{
		boolean testResult = false;

		ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver);

		boolean isPasswordChanged = changePasswordPage.resetPassword();

		if (isPasswordChanged == true) 
		{
			System.out.println("Password changed successfully.");
			testResult = true;
		} 
		else 
		{
			System.out.println("Failed to change password .");
		}
		
		return testResult;
	}

}
