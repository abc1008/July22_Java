package pack1;

public class ForEachLoop {
	
	
	public static void main(String[] args) {
		
		
		int [] array1 = {3,6,2,4,7};
		
//		System.out.println(array1[0]);
//		System.out.println(array1[1]);
//		System.out.println(array1[2]);
//		System.out.println(array1[3]);
//		System.out.println(array1[4]);
		
		
		for(int i =0; i<=4; i++)
		{
			System.out.println(array1[i]);
		}
		
		
		System.out.println();
		System.out.println("****** ForEachLoop *****");
		System.out.println();	
		
		
//		int [] array1 = {3,6,2,4,7};
		
//		SYNTAX
		
//		for(dataType var1: dataStructure)
//		{
//			// code to repeate
//		}
		
		for( int num : array1)
		{
			System.out.println(num);
		}
		
		
		
	}
	
	
	
	
	
	

}
