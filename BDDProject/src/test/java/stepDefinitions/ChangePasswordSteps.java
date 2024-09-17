package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basepack.BaseClass;
import ecommAppPack.EcommAppObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordSteps{
	
	@Given("User clicks on password button")
	public void clickPassword()
	{
		EcommAppObjects.changePasswordPage().clickPassword();
	}
	
	@When("User enters password and confirm password")
	public void enterNewPasswords()
	{
		EcommAppObjects.changePasswordPage().enterNewPasswords();
	}
	
	@And("clicks on continue button")
	public void clickContinue()
	{
		EcommAppObjects.changePasswordPage().clickContinue();
	}
	
	@Then("password should be changed successfully.")
	public void verifySuccessfulPasswordChange() throws InterruptedException
	{
		
		EcommAppObjects.changePasswordPage().verifySuccessfulPasswordChange();
	
		
	}


}
