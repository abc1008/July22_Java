package pack1;


public class Operators {
	
	

	public static void main(String[] args)
	{
		
		
		int x = 60;
		System.out.println(x);
		
		// pre-increment operator
		
		int y = ++x;  	// First value of x will be increased by 1 and then assigned to y
		
		System.out.println(y);
		
		
		
		
		System.out.println();  // new line 
		System.out.println("***************");
		System.out.println();
		
		
		
		// post-increment
		
		int a = 40;
		
		System.out.println(a);
		int b = a++;  // First value of a will be assigned to b then increased by 1
		
		System.out.println(b);
		System.out.println(a);
		
		
		System.out.println();
		System.out.println("***************");
		System.out.println();
		
		
		
		
		// pre-decrement
		
		int p = 80;
		int q = --p;   // First value of p will be decreased by 1 and then assigned to q
	
		System.out.println(q);
		
		
		System.out.println();
		System.out.println("***************");
		System.out.println();
		
		// post-decrement
		
	
		int r = 30;
		System.out.println(r);
		
		int s = r--;  // First value of r will be assigned to s then decreased by 1
		
		System.out.println(s);
		System.out.println(r);
		
		
		
		
		System.out.println();
		System.out.println("***************");
		System.out.println();
		
		
		
		
		int aa = 80;
		int bb = 80;
		
		
		boolean result = aa > bb;
		System.out.println(result);
		
		
		boolean result2 = aa < bb;
		System.out.println(result2);
		
		
		
		System.out.println();
		System.out.println("***************");
		System.out.println();
		
		
		int xx = 70;
		int yy = 70;
		
		boolean result3 = xx >= yy;
		System.out.println(result3);
		
		boolean result4 = xx <= yy;
		System.out.println(result4);
		
		
		
		System.out.println();
		System.out.println("***************");
		System.out.println();
		
		
		boolean result5 = (xx == yy);
		System.out.println(result5);
		
		
		System.out.println();
		System.out.println("***************");
		System.out.println();
		
		
		int pp = 70;
		int qq = 70;
		
		boolean result6 = (pp != qq);
		System.out.println(result6);
		
		
		System.out.println();
		System.out.println("******  Logical AND *********");
		System.out.println();
		
		int rr = 70;
		int ss = 90;
		
		
		boolean result7 = (rr != ss) && (rr < ss)  && (rr < 80);
		
		System.out.println(result7);
		
		
		
		System.out.println();
		System.out.println("******  Logical OR *********");
		System.out.println();
		
		
		
		int u = 80;
		int v = 90;
		
		
		 boolean result8 = (u != v) || (u > v)  || (u >= 80);
		
		System.out.println(result8);
		
		
		System.out.println();
		System.out.println("***************");
		System.out.println();
		
		
		
		int uu = 80;
		int vv = 90;
		
								
		 boolean result9 = (uu == vv)  &&  (uu > vv) ||  (uu >= 80);
		
		System.out.println(result9);
		
		
		
		
		
		
		
		
	}

}