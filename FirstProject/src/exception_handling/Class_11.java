package exception_handling;

public class Class_11 
{
	
	
	public static void main(String[] args) {
		try
		{
			int a = 15;
			int b = 0;

			int c = a/b;
			System.out.println("After risky code");
			System.out.println("Close excel");
			System.out.println(c);
			
		}
		catch(Exception ex)
		{
			System.out.println("Catch block running");
		}
		finally 
		{
			System.out.println("Finally block running");
		}
		
		System.out.println("After try-catch");
	}

}
