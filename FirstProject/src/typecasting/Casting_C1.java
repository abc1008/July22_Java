package typecasting;

public class Casting_C1 extends Casting_P1{
	
	
	public void m1()
	{
		System.out.println("m1 of child");
	}
	
	
	public static void main(String[] args) {
		
		Casting_C1 childRef = new Casting_C1();
		childRef.m1();
		
		Casting_P1 convRef = (Casting_P1)childRef;   // changing the type of child class ref variable into parent class
		// Casting_P1 convRef  = new Casting_C1(); 
		convRef.m1();   
		
		
		
		// downcasting
		Casting_P1 refP1 = new Casting_P1();  // parent ref + parent obj
		refP1.m1();
		
		Casting_C1 convRef2 = (Casting_C1)refP1;
		
//		Casting_C1 convRef2 = new Casting_P1();  
//		Child ref = Parent obj
		
		convRef2.m1(); 
		
		
		
	}
	

}
