package pack1;

public class LoopsDiscussion2 {

	
	
	
	public static void main(String[] args) {
		
//		SYNTAX:
		
//		while(boolean condition)
//		{
//			// code to repete/iterate
//		}
		
		
		int num = 5;
		
		while( num >= 1 )
		{
			System.out.println("Loop : " + num);
			num--;
		}
		
		System.out.println("After while loop");
		
		
		
		System.out.println();
		System.out.println("****** Do While Loop *****");
		System.out.println();
		
		
//		SYNTAX: 
		
//		do
//		{
//			// code to repeate/iterate
//		}
//		while(boolean condition);
		
		
		
		int x = 1;
		
		do
		{
			System.out.println("Loop : " + x);
			x++;
		}
		while(x <= 5);
		
		
		System.out.println("After do while loop");
		
		
		System.out.println();
		System.out.println("****** break keyword *****");
		System.out.println();
		
//		SYNTAX :
		
//				1			  2,5,8				4,7
//		for(initialization; condition; increment/decrement)
//		{
//			
//					3,6,9
//			// code to repeate/iterate
//			
//		}
		
		
		for(int i = 1; i <= 5; i++)
		{
			
			System.out.println("Loop : " + i);
			
			if(i == 3)
			{
				break;   // break the loop
			}
			
			System.out.println("After if block");
		}
		
		System.out.println("After for loop");
		
		
		System.out.println();
		System.out.println("****** continue keyword *****");
		System.out.println();
		
		
		
		for(int i = 1; i <= 5; i++)
		{
			
			if(i == 3)
			{
				continue;   // skip current condition (i == 3) and jump to next
			}
			
			System.out.println("Loop : " + i);
		}
		
		System.out.println("After for loop");
		
		
		
	}
	
}
