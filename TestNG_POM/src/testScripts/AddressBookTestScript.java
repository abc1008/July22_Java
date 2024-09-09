package testScripts;

import basePack.BaseClass;
import pageClasses.AddressBookPage;

public class AddressBookTestScript extends BaseClass {
	
	public void performChangeAddress()
	{
		AddressBookPage addressBookPage = new AddressBookPage(driver);
		addressBookPage.changeAddress();
	}
	
	
}
