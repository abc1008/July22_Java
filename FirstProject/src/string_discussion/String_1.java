package string_discussion;

public class String_1 {
	
	
	
	
	
	public static void main(String[] args) {
		
		
//		SYNTAX 1 :
		
//		String variableName= "ValueOfString/ String Literal";
		
		String s1 = "abc";   // only 1 object, in SCP
		System.out.println(s1);
		
		String s3= "abc";  // 
		
		
		
//		SYNTAX 2:
		
//		String variableName = new String("ValueOfString/ String Literal);
		
		String s2 = new String("pqr");  // 2 objects, 1 in SCP and 2nd in Heap
		
		System.out.println(s2);
		
		String s4 = new String("pqr");
		
		
		
	}
	
	
	
	
	
	
	
	

}
