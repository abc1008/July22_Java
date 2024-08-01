package oops_discussion;

public class ChildClass2 extends ParentClass{
	
	
	
	
	
	public static void main(String[] args) {
		
		m1();   // parent class static method accessed directly by method name
		
		ChildClass2 p1 = new ChildClass2();
		p1.m2();   // parent class non-static method accessed using child class object
	}
	
	
	
	
	
	
	

}
