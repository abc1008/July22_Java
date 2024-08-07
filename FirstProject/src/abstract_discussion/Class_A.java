package abstract_discussion;

public abstract class Class_A {
	
	
	int a = 100;
	static int b= 200;
	
	public Class_A()
	{
		System.out.println("Class_A Constructor is running");
	}
	
	
	public abstract void m1();  // abstract method/incomplete method
	
	
	public void m2()           // concrete method/complete method
	{
		System.out.println("m2");
	}
	
	
	public abstract void m3();
	
//	public static abstract void m4();
	
	public static void m5()
	{
		System.out.println("m5");
	}
	
	
	public static void main(String[] args) {
		
		m5();
	}
	
	
}
