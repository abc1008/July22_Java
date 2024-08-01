package pack1;

public class VariableDiscussion2 {
	
	
	
	public static void m1()
	{
		System.out.println(VariableDiscussion.a);  // calling static variable in static method
		
		VariableDiscussion var1 = new VariableDiscussion();
		System.out.println(var1.c);    // calling non-static variable in static method
	}
	
	public void m2()
	{
		System.out.println(VariableDiscussion.a);  // calling static variable in non-static method
		
		VariableDiscussion var1 = new VariableDiscussion();
		System.out.println(var1.c);   // calling non-static variable in non-static method
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(VariableDiscussion.a);
		
		VariableDiscussion var1 = new VariableDiscussion();
		System.out.println(var1.c);
		
		
		
		VariableDiscussion2 var2 = new VariableDiscussion2();
		
		System.out.println();
		System.out.println(" ****** static method call *********  ");
		System.out.println();
		
		
		m1(); 
		
		
		System.out.println();
		System.out.println(" ******* non- static method call ********  ");
		System.out.println();
		
		
		
		var2.m2();
		
		
	}
	
	
	
	

}
