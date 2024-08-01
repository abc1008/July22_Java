package pack1;

public class VariableDiscussion3 {
	
	int num = 80;
	static int num2 = 70;
	
	public static void main(String[] args) {
		
		VariableDiscussion3 v1 = new VariableDiscussion3();
		System.out.println("Value of variable num : " + v1.num);
		v1.num = 90;
		System.out.println("Value of num based on v1 : " + v1.num);
		
		VariableDiscussion3 v2 = new VariableDiscussion3();
		System.out.println("Value of num based on v2 : " + v2.num);
		
		VariableDiscussion3 v3 = new VariableDiscussion3();
		System.out.println("Value of num based on v3 : " + v3.num);
		
		
		System.out.println();
		System.out.println("********* STATIC VARIABLE *********");
		System.out.println();
		
		System.out.println("Value of variable num2 : " + v1.num2);
		v1.num2 = 40;
		System.out.println("Value of num2 based on v1 : " + v1.num2);
		
		System.out.println("Value of num2 based on v2 : " + v2.num2);
		System.out.println("Value of num2 based on v3 : " + v3.num2);
	}
	
	
	

}
