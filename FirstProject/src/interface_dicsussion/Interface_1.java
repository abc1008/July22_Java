package interface_dicsussion;

public interface Interface_1 extends Interface_2 {
	
	public static final int var1 = 100; // by default public static and final
    
	
	int var2 = 200;
    
	int a = 100;

	
	
	public abstract void m1();   
	
	void m2();  // by default these are public and abstract
	
	void m3();
	
	int m7();
	
	public static void m8()
	{
		System.out.println("m8");
	}
	
	
	public static void main(String[] args) {
		
		
		m8();  // within same interface
		System.out.println(var1); // within same interface
	}
	

}
