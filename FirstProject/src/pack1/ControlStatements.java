package pack1;

public class ControlStatements {

	public void m1() {
		int a = 10;
		int b = 20;

//		if(boolean condition)
//		{
//			// body of if block
//		}
//		else
//		{
//			// body of else block
//		}

		System.out.println("Before if-else block");

		if (a > b)
			System.out.println("value of a is greater than b");
		else if ((a * b) > 400) {
			System.out.println("(a * b) > 400");

		} else {
			System.out.println("both conditions are false.");
			System.out.println("2nd line of code");
		}

		System.out.println("After if-else block");

	}

	public void m2() {

//		switch(expression)
//		{
//			
//			case a:
//				// code to execute
//			break;
//		
//			
//			case b:
//				// code to execute
//			break;
//		
//		
//			case c:
//				// code to execute
//			break;
//		
//		}

		int dayNum = 0;

		switch (dayNum) {

		case 0:
			System.out.println("Sunday");
			System.out.println("Sunday");
			System.out.println("Sunday");
			System.out.println("Sunday");
			
			break;

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;
			
		default :
			System.out.println("Value is incorrect.");
			break;

		}

	}

	public static void main(String[] args) {

		ControlStatements cs = new ControlStatements();
		cs.m2();
		
		
		System.out.println("GIT Test Change");

	}

}
