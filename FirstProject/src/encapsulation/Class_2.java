package encapsulation;

public class Class_2 {
	
	
	public static void main(String[] args) {
		
		Class_1 c1 = new Class_1();
		
		double bal = c1.viewBalance();
		
		System.out.println(bal);
		
		
		c1.withdraw(5000);
		
	}
	
	
	
	

}
