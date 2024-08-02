package oops_discussion;

import access_modifiers.ClassA;

public class ProtectedTest extends ClassA{
	
	
	public static void main(String[] args) {
		ClassA aa = new ClassA();
		
		ProtectedTest.m1();
		
		System.out.println(var1);
		
		ProtectedTest t1 = new ProtectedTest();
		t1.m2();
		
		System.out.println(t1.var2);
		
	}
	
	
	
	
	

}
