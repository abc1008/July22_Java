package pack1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(pack1.ListenerClass.class)
public class ListenerTest {
	
	@Test
	public void TestCase2()
	{
		System.out.println("TestCase2");
		Assert.fail();
	}
	
	
	@Test(dependsOnMethods = "TestCase2")
	public void TestCase1()
	{
		System.out.println("TestCase1");
	}
	
	
	
	
	
	
	
	
	

}
