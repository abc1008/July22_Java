package testSuites;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;
import testScripts.ChangePasswordTestScript;

public class ChangePasswordTestSuite extends BaseClass{
	
	@Test
	public void TC_123_ChangePasswordTest()
	{
		Assert.assertTrue(new ChangePasswordTestScript().performChangePassword());
	}


}
