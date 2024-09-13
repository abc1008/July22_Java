package testScripts;

import java.io.IOException;

import basePack.BaseClass;
import ecommAppPack.EcommAppObjects;
import utility.ExtentReportsHelper;

public class ChangePasswordTestScript extends BaseClass {

	public boolean performChangePassword() throws IOException 
	{
		boolean testResult = false;
		
		boolean isPasswordChanged = EcommAppObjects.changePasswordPage().resetPassword();
		
		if (isPasswordChanged == true) 
		{
			ExtentReportsHelper.logPass("Password changed successfully.");
			testResult = true;
		} 
		else 
		{
			ExtentReportsHelper.logFail("Failed to change password.");
		}
		
		return testResult;
	}

}
