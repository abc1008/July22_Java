package abstract_discussion;

public class Class_B extends Class_A{


	public void m1() 
	{
		
		System.out.println("m1 body");
	}


	public void m3() 
	{
		
		System.out.println("m3 body");
	}

	
	
	
	public static void main(String[] args) {
		
		Class_B b1 = new Class_B();
		b1.m1();
		b1.m2();
		b1.m3();
		
		System.out.println();
		System.out.println("****** parent ref and child obj *****");
		System.out.println();
		
		Class_A a1 = new Class_B();  // parent ref and child obj
		a1.m1();
		a1.m2();
		a1.m3();
	
//		Class_A a1 = new Class_A();  error thrown
		
		
		
		Class_A.m5();
		
		// variables call
		System.out.println(b1.a);
		System.out.println(b);
		
		
		
		
		
		
		
		
	}


}
