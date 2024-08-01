package pack1;

public class MethodCategories {
	
	
	public void addition(int a, int b) 
	{
//		a = 100;   
//		b = 200;  // initializing the variable
		
		int ans = a + b;
		
		System.out.println(ans);
		
	}
	
	public int m1()
	{
		
		
		return 8;
	}
	
	
	public static int subtraction(int a, int b) 
	{
//		void = nothing, i.e. just exeute the logi and don't return anything
		
		int ans = a - b;
		
		
		return ans;
		
	}
	
	public double div(int a, int b)
	{
		 double ans2 = (a/b);
		
		
		return ans2;
		
		
	}
	
	
	public void multiply(int num, int a, int b)
	{
		
		int subOutput = subtraction(a,b);
		
		
		System.out.println(num * subOutput);
	}
	
	
	public static void main(String[] args) {
		
		MethodCategories mc = new MethodCategories();
		mc.addition(100,50);
		mc.addition(90,40);
		
		 int ansOfMethod = subtraction(100, 30);
		 System.out.println(ansOfMethod);
		 
		 mc.multiply(100, 200, 50);
		
	}
	
	
	
	
	
	
	
	

}
