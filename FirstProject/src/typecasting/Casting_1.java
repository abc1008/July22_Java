package typecasting;

public class Casting_1 {
	
	public int m1(int a , int b)
	{
		int ans = a + b;
		
		return ans;
	}
	
	
	public void m2(long num)
	{
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		byte b = 10;  // -->  int
		
		
		
		
		int c = (int)b;  // changing the data type of b from byte to int
		
		System.out.println(c);
		
		
		//range of byte :  -128, -127, -126, ....0,1,2,3, .... ,127

		int x = 129;
		
		byte y = (byte)x;   // changing the data type of x from int to byte
		
		System.out.println(y);
		
		
		
		
		int ans = y + 60;
		System.out.println(ans);
		
		
		
		
	}
	
	
	
	
	
	
	

}
