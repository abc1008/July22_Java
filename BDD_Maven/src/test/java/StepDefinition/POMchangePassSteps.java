package StepDefinition;

import java.io.IOException;

import ecommAppPack.EcommAppObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageClasses.POMChangePassPage;

public class POMchangePassSteps{
	
//	static POMChangePassPage cp;
	
	@Given("that user clicks on Password button")
	public void clickPassOption()
	{
		EcommAppObjects.pomChangePassPage().clickPasswordButton();
	}
	
	@And("enters new password and confirm password")
	public void enterNewPass()
	{
		EcommAppObjects.pomChangePassPage().enterNewPassword();
	}
	
	@And("hits continue button")
	public void clickContinue()
	{
		EcommAppObjects.pomChangePassPage().hitContinueButton();
	}
	
	@Then("password should be changed successfully.")
	public void verifyChangePass() throws IOException
	{
		EcommAppObjects.pomChangePassPage().verifySuccessfulPassChange();
	}

}
