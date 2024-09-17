package StepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basePack.BaseClass;
import basePack.POMBaseClass;
import ecommAppPack.EcommAppObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ConfigHelper;

public class POMLoginSteps{
	
	@Given("user navigates to demo site login form")
	public void navigateToWebsite() throws IOException
	{	
		POMBaseClass.driver.get(ConfigHelper.getData("TestSiteUrl"));
	}
	
	@When("user enters username and password")
	public void entervalidCredentials() throws InterruptedException, IOException
	{
		EcommAppObjects.pomLoginPage().enterCredentials();
	}
	
	@And("hits login button")
	public void clickLoginButtoon() throws InterruptedException, IOException
	{
		EcommAppObjects.pomLoginPage().hitLogin();
	}
	
	@Then("user is logged in successfully")
	public void verifySuccessulLogin() throws InterruptedException
	{
	    Thread.sleep(2000);
	    System.out.println("Login Successful.");
	}

}
