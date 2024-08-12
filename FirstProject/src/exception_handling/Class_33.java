package exception_handling;

public class Class_33 {
	
	public static void m1(int num)
	{
		
		System.out.println("num : " + num);
		
		if(num > 0)
		{
			num = num + 1;
			m1(num);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		m1(2);
		
	}
	
	
	
	
	

}
