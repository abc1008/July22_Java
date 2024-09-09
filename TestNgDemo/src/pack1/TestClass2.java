package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass2 {
	
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
	
	@Test(groups = "Sanity" )
	public void TestCase4()
	{
		System.out.println("Test Case 4");
	}
	
	@Test (groups = "Regression" )
	public void TestCase5()
	{
		System.out.println("Test Case 5");
		Assert.fail();
	}
	
	@Test(groups = "Sanity" )
	public void TestCase6()
	{
		System.out.println("Test Case 6");
		Assert.fail();
	}
	
	
	
	
	
	
	
	
	

}
