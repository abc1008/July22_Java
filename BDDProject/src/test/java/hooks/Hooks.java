package hooks;

import java.io.IOException;

import basepack.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void initializeDriver() throws InterruptedException, IOException
	{
		BaseClass.testSetup();
	}
	
	@After
	public void closeDriver()
	{
		BaseClass.tearDown();
	}

}
