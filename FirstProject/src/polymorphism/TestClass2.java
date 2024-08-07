package polymorphism;

public class TestClass2 extends TestClass1{
	
	int a = 600;
	static int b = 700;
	int c = 300;
	
	
	// overloaded 
	public void m1(int a, char b)
	{
		System.out.println("m1 -  2 arg - child");
	}
	
	
	public void m1()
	{
		System.out.println("m1 -  child");
	}
	
	public void m2()
	{
		System.out.println("m2 -  child");
	}
	
	
	public static void main(String[] args) {
		
		TestClass2 tc2 = new TestClass2();   // child ref + child object
		tc2.m1();   // overidden 
		tc2.m1(5, 't');   // overloaded 
		tc2.m1(6, 'o', 4);
		tc2.m2();
		
		System.out.println();
		TestClass1 tc1 = new TestClass1();    // parent ref + parent object
		tc1.m1();   // overidden 
		tc1.m1(0);  // overloaded 
		tc1.m2(); 
		
		System.out.println();
		TestClass1 tc3 = new TestClass2();   // parent ref  + child object
		tc3.m1();   // overidden - from child because 'child object'
		tc3.m1(5, 'k', 9);  // overloaded - from parent because 'parent ref'
		tc3.m2();
		
		
		System.out.println();
		
		// variables - variable call is based on refrence variable

		System.out.println(tc2.a); // from child 
		System.out.println(tc1.a); // from parent 
		System.out.println(tc3.a); // from parent 
		
		
		System.out.println();
		System.out.println("******* Overriding w.r.t. static methods *******");
		System.out.println();
		
		
		
		TestClass1 tc4 = new TestClass2();   // parent ref  + child object
		tc4.m1();  
		
		
		
		
		
	}

}
