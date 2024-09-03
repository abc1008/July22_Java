package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass4 {

	@Test
	public void TestCase1() 
	{
		System.out.println("TestCase1");

		Assert.fail(); // 

	}

	@Test
	public void TestCase2() 
	{
		int a = 9;
		System.out.println("TestCase1");
		
		boolean result = false;
		
		String accName = "Test1";
		
		if(a > 10)
			result = true;

		
//		Assert.assertEquals(accName, "Test1");
		
//		Assert.assertTrue(result, "TestCase2 failed");
		
//		Assert.assertFalse(result, "TestCase2 failed");
		
		
		Assert.assertNotEquals(result, false);
		
		
		
		
	}

}
