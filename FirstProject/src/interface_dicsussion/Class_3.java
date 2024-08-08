package interface_dicsussion;

public class Class_3 implements Interface_1, Interface_2{
	

	public void m4() {
		
		System.out.println("m4");
		
	}

	public void m5() {

		System.out.println("m5");
	}


	public void m1() {

		System.out.println("m1");
	}


	public void m2() {

		System.out.println("m2");
	}


	public void m3() {

		System.out.println("m3");
	}

	// method in both interfaces with same method signature
	public int m7() {
		
		System.out.println("m7");
		
		return 7;
	}
	
	public static void main(String[] args) {
		
		
		Interface_1.m8();
		System.out.println(Interface_1.var2);
		
		
		
		
		
	}
	
	

}
