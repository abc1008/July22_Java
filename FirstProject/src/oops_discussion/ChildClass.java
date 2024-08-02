package oops_discussion;

public class ChildClass extends ParentClass{
	
	
	int num1 = 300;
	static int num2 = 400;
	
	public void m2()
	{
		System.out.println(super.num1); // parent class non-static variable
	}
	
	public static void main(String[] args) {
		
		m1();   // parent class static method accessed directly by method name
		ChildClass p1 = new ChildClass();
		p1.m2();   // parent class non-static method accessed using child class object
	
	System.out.println(num2);
	System.out.println(p1.num1);
	
	// super keyword
	System.out.println(ParentClass.num2);
	
	
	p1.m2();
	
	
	}
	
	
	
	
	
	
	
	

}
