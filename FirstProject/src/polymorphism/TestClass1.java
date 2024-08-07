package polymorphism;

public class TestClass1 {
	
	final int a = 100;
	final static int b = 200;
	
	
	public void m1()
	{
		System.out.println("m1 - parent");
	}
	
	public void m1(int a)
	{
		System.out.println("m1 -  1 arg - int");
	}
	
	public void m2()
	{
		System.out.println("m2 -  parent");
	}
	
	public void m1(int a, char b, int c)
	{
		System.out.println("m1 -  3 arg - parent");
	}
	
	
	public static void main(String[] args) {
		
		
		TestClass1 tc1 = new TestClass1();
//		tc1.m1(5);
		
		
		
		System.out.println(b);
		
	}
	
	
	
	
	

}
