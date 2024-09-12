package testScripts;

import java.io.IOException;

import basePack.BaseClass;
import ecommAppPack.EcommAppObjects;
import pageClasses.ChangePasswordPage;
import utility.ExtentReportsHelper;

public class ChangePasswordTestScript extends BaseClass {

	public boolean performChangePassword() throws IOException 
	{
		boolean testResult = false;
//		ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver);
//		boolean isPasswordChanged = changePasswordPage.resetPassword();
		
		boolean isPasswordChanged = EcommAppObjects.changePasswordPage().resetPassword();
		
		if (isPasswordChanged == true) 
		{
//			System.out.println("Password changed successfully.");
			
			ExtentReportsHelper.logPass("Password changed successfully.");
			testResult = true;
		} 
		else 
		{
//			System.out.println("Failed to change password .");
			ExtentReportsHelper.logFail("Failed to change password.");
		}
		
		return testResult;
	}

}
