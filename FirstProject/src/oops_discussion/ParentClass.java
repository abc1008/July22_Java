package oops_discussion;

public class ParentClass {
	
	public static void m1()
	{
		System.out.println("m1 of ParentClass");
	}
	
	public void m2()
	{
		System.out.println("m2 of ParentClass");
	}
	
	
	
	public static void main(String[] args) {
		
		m1();
		
		ParentClass p1 = new ParentClass();
		p1.m2();
		
		
		
	}
	
	
	
	

}
