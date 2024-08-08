package interface_dicsussion;

public class Class_2 extends Class_1{


	public void m3() 
	{
		
		System.out.println("m3");
	}
	
	public int m7() 
	{
		
		System.out.println("m7");
		
		return 8;
	}
	
	
	
	public static void main(String[] args) {
		
		
		Class_2 c1 = new Class_2(); // implementation Class ref and obj
		c1.m1();
		c1.m2();
		c1.m3();
		
		System.out.println();
		
		Interface_1 ref1 = new Class_2();  // Interface ref +implementation Class obj
		ref1.m1();
		ref1.m2();
		ref1.m3();
		
		
		
		
		
		
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}




}
