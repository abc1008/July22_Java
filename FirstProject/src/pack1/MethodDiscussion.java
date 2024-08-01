package pack1;

public class MethodDiscussion {
	
//	 SYNTAX: non-static method
	
//	public void methodName()
//	{
//		// logic or method body
//	}
	
	public void printData()
	{
		System.out.println("this is non-static method of MethodDiscussion class ");
		
	}
	
	
	
//	SYNTAX: static method
	
//	public static void methodName()
//	{
//		// logic or method body
//	}
	
	
	public static void printData2()
	{
		System.out.println("this is static method of MethodDiscussion class");
		
		MethodDiscussion var1 = new MethodDiscussion();
		var1.printData();   // non-static method call
		
	}
	
	
	
	public void m1()   // non-static 
	{
		System.out.println("Call static method inside non-static method");
		printData2();  // call static method
		
		
		MethodDiscussion var1 = new MethodDiscussion();
		var1.printData();   					// non-static method call
	}
	
	
	public static void m2()
	{
		printData2();   // static method inside another static method
	}
	
	
	public static void main(String[] args) 
	{
		
		MethodDiscussion ref1 = new MethodDiscussion();
//		ref1.printData();  								// calling non-static method
//		System.out.println("printData method line completed in main method.");
		

		
		ref1.printData2();   // not recommended 
		
//		System.out.println();
//		System.out.println("Non-Static Method m1 call");
//		System.out.println();
		ref1.m1(); 
		
//		System.out.println();
//		System.out.println();
		
		
		
		System.out.println();
		m2();
		
		
		
//		printData2();        // calling of static method by methodName();
//		System.out.println("printData2 method line completed in main method.");
		
	}

}
