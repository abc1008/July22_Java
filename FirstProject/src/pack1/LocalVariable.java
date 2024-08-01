package pack1;

public class LocalVariable {
	
	// global variables
	int a = 10;
	static int b = 20;
	
	
	// non-static 
	public void m1()
	{
		int c=700;   // local variable
		System.out.println(c);
		
		int a = 500;      // local variable
		
		System.out.println(a);
		
		// 1st way 
//		LocalVariable v = new LocalVariable();
//		System.out.println(v.a);
		
		System.out.println(this.a);  // this keyword - nonstatic variable of current class
		
	}
	
	
	public static void m2()
	{
		int c=700;   // local variable
		
		
//		System.out.println(this.a);  // this keyword
	}
	
	
	public static void main(String[] args) 
	{
		
		int d = 800;
		
		LocalVariable v = new LocalVariable();
		System.out.println(d);
		
		v.m1();
		
		
		
//		System.out.println(v.a);  
//		System.out.println(b);
		
	}

}
