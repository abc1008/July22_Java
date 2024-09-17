package hooks;

import java.io.IOException;

import basePack.POMBaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() throws IOException {
		POMBaseClass.initializeDriver();
	}

	@After
	public void tearDown() {
		POMBaseClass.closeDriver();
	}


}
