package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass6 {
	
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
	
	@Test(dependsOnGroups = "Sanity")
	public void TestCase302()
	{
		System.out.println("TestCase302");
		Assert.fail();
	}
	
	@Test
	public void TestCase303()
	{
		System.out.println("TestCase303");
	}
	
	
	
	
	
	
	
	
	

}
