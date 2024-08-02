package pack1;

public class VariableDiscussion {
	
	
	static int a = 10;   // declaration + initialization
	static int b;   // declaration
	
	
	int c = 100;    // non-static variable (declaration + initialization)
	int d;       	// variable declaration
	
	
	
	
	static void m1()
	{
		
		System.out.println(a);    // static variable - by variablename;
		
		VariableDiscussion var1 = new VariableDiscussion();
		System.out.println(var1.c);   // calling non-static variable in static method
		
	}
	
	
	
	void m2()
	{
		
		System.out.println(a);     // static variable - by variablename;
		System.out.println(c);    // non-static variable in non-static method
		
	}
	
	public static void main(String[] args) {
		
		
	
		System.out.println(a);
		System.out.println(b);
		
		
		VariableDiscussion var1 = new VariableDiscussion();
		System.out.println(var1.c);
		
		System.out.println(var1.d);
		
		System.out.println();
		System.out.println(" ****** static method call *********  ");
		System.out.println();
		
		
		m1(); 
		
		
		System.out.println();
		System.out.println(" ******* non- static method call ********  ");
		System.out.println();
		
		
		
		var1.m2();
		
		

	}
	
	
	
	

}
