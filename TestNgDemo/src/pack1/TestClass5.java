package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass5 {
	
	@BeforeClass
	public void beforeClass2()
	{
		System.out.println("beforeClass2");
	}
	
	@AfterClass
	public void afterClass2()
	{
		System.out.println("afterClass2");
	}
	
	@Test()
	public void TestCase201()
	{
		System.out.println("TestCase201");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "TestCase201" )
	public void TestCase202()
	{
		System.out.println("TestCase202");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "pack1.TestClass2.TestCase5")
	public void TestCase203()
	{
		System.out.println("TestCase203");
	}
	
	
	
	
	
	
	
	
	

}
