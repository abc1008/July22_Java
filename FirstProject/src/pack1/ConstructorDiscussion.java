package pack1;

public class ConstructorDiscussion {
	
	
	int num1;
	int num2 = 100;
	
	
//	SYNTAX:
	
//	public ClassName()
//	{
//		// constructor Body
//	}
	
	public ConstructorDiscussion()
	{
		System.out.println("0 arg Constructor is runnig - ConstructorDiscussion");
		num1 = 500;
		num2 = 500;
		
	}
	
	public ConstructorDiscussion(int a)  
	{ 
		this("uiy");   // calling 1 arg Constructor of current class
		System.out.println("int 1 arg Constructor is runnig - ConstructorDiscussion");
	}
	
	
	public ConstructorDiscussion(String b)
	{
		this();  // calling 0 arg Constructor of current class
		System.out.println("String arg Constructor is runnig - ConstructorDiscussion");
	}
	
	
	
	public void m1()
	{
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public static void m2()
	{
		ConstructorDiscussion ref1 = new ConstructorDiscussion(6);
		System.out.println(ref1.num1);
		System.out.println(ref1.num2);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorDiscussion ref1 = new ConstructorDiscussion(5);
//		ref1.m1();
//		
//		ConstructorDiscussion ref2 = new ConstructorDiscussion();
//		ref2.m1();
		
		
		ConstructorDiscussion ref3 = new ConstructorDiscussion("ss");
		
	}
	
	
	
	
	
	
	

}
