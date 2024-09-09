package testSuites;

import org.testng.annotations.Test;

import basePack.BaseClass;
import testScripts.ChangePasswordTestScript;

public class ChangePasswordTestSuite extends BaseClass{
	
	@Test
	public void TC_123_ChangePasswordTest()
	{
		ChangePasswordTestScript changePasswordTestScript = new ChangePasswordTestScript();
		changePasswordTestScript.performChangePassword();
	}
	
	
	

}
