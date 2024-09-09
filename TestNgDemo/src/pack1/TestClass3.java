package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass3 {
	
	@BeforeClass
	public void beforeClass3()
	{
		System.out.println("beforeClass3");
	}
	
	@AfterClass
	public void afterClass3()
	{
		System.out.println("afterClass3");
	}
	
	@Test
	public void TestCase7()
	{
		System.out.println("Test Case 7");
	}
	
	@Test(groups = "Regression" )
	public void TestCase8()
	{
		System.out.println("Test Case 8");
	}
	
	@Test
	public void TestCase9()
	{
		System.out.println("Test Case 9");
	}
	
	@Test(groups = "Sanity" )
	public void TestCase100()
	{
		System.out.println("TestCase100");
	}
	
	@Test
	public void TestCase200()
	{
		System.out.println("TestCase200");
	}
	
	
	
	
	
	
	

}
