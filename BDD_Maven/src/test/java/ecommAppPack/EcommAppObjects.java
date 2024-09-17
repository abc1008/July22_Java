package ecommAppPack;

import basePack.POMBaseClass;
import pageClasses.POMChangePassPage;
import pageClasses.POMLoginPage;

public class EcommAppObjects extends POMBaseClass {

	private static POMLoginPage _POMLoginPage;
	public static POMLoginPage pomLoginPage() 
	{
		_POMLoginPage = new POMLoginPage(driver);
		
		return _POMLoginPage;
	}
	
	
	private static POMChangePassPage _POMChangePassPage;
	public static POMChangePassPage pomChangePassPage() 
	{
		_POMChangePassPage = new POMChangePassPage(driver);
		
		return _POMChangePassPage;
	}
	
	
	
	
	
}
