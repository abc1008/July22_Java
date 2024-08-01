package pack1;

public class ArrayDiscussion {
	
	public static void main(String[] args) {
		
		System.out.println("GIT Test Change");

		System.out.println("GIT Test Change from GITHUB");
		
		
//		SYNTAX:  
		
//		dataType [] arrayName = {value1, value2, value3, ... };
		
		int [] array1 = {10,20,30,40,50,60};
		
		
//		How to access the data from array
		
		
		int dataFromArray = array1[4];
		
		System.out.println(dataFromArray);
		System.out.print(array1[2]);
		
		int add = array1[1] + 100;
		
		System.out.println(add);
		
		
		// Array Length : 
		int arraySize = array1.length;
		System.out.println(arraySize);
		
		System.out.println(array1[2]);
		
		
		
//		update/change the data from array
		
		array1[2] = 1000;
		
		System.out.println(array1[2]);
		
		
		
		
		byte [] byteArray = {60,80,40,6,30,60};
		double [] doubleArray = {60.66,80.6,40.88};
		
		
		

//		SYNTAX 2:
		
		
//		dataType [] arrayName = new dataType[arraySize];
		
		int [] intArray = new int[4];
		
		System.out.println(intArray[1]);
		
		// update/change numbers in array
		intArray[1] = 60;
		intArray[0] = 90;
		intArray[2] = 70;
		
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);

		
		
		String [] strArray = {"gbc", "abc", "pqr"};
		
		
		
		
	}

}
