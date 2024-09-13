package testScripts;

import basePack.BaseClass;
import ecommAppPack.EcommAppObjects;
import pageClasses.AddressBookPage;

public class AddressBookTestScript extends BaseClass {
	
	public void performChangeAddress()
	{
		EcommAppObjects.addressBookPage().changeAddress();
	}
	
	
	
	
}
