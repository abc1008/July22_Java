package access_modifiers;

public class ClassA {
	
	protected static int var1 = 100;
	protected int var2 = 200;
	
	
	protected static void m1()
	{
		System.out.println("m1");
	}
	
	protected void m2()
	{
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		
		ClassA aa = new ClassA();
		aa.m1();
		
		System.out.println(var1);
	}
	

}
