package testSuites;

import org.testng.annotations.Test;

import basePack.BaseClass;
import testScripts.AddressBookTestScript;

public class AddressBookTestSuite extends BaseClass {
	
	
	@Test
	public void TC_123_ChangeAddressTest()
	{
		AddressBookTestScript addressBookTestSuite = new AddressBookTestScript();
		addressBookTestSuite.performChangeAddress();
	}
	

}
