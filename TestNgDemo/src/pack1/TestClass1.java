package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeMethod
	public void preCondition()
	{
		System.out.println("preCondition");
	}
	
	@AfterMethod
	public void postCondition()
	{
		System.out.println("postCondition");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	
	@Test(priority = 0)
	public void z1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test(priority = 3)
	public void a2()
	{
		System.out.println("Test Case 2");
	}
	
	@Test(priority = 3, enabled = false)
	public void m3()
	{
		System.out.println("Test Case 2");
	}
	
	
	

}
