package string_discussion;

public class String_2 {

	public static void main(String[] args) {
		
		
		String s1 = "Testo,meter";
		System.out.println(s1);
		
//		 1. length();
		int total = s1.length();
		System.out.println(total);
		
//		 2. concat();
		
		String appString = s1 + " World";
		System.out.println(appString);
		
		String appString2 = s1.concat(" World");
		System.out.println(appString2);
		
		
//		3. charAt();   String s1 = "Testometer";
		
		System.out.println(s1.charAt(4));
		
		
//		4. equals()
		
		boolean result = s1.equals("Testometer");
		System.out.println(result);
		
		
//		5. equalsIgnoreCase();
		
		
		boolean result2 = s1.equalsIgnoreCase("tesTometEr");
		System.out.println(result2);
		
		
//		6.1 SubString(int beginIndex);   String s1 = "Testometer";
		
		// Substring : continuous part of given string
		
		System.out.println(s1.substring(5));
		
		
//		6.2  SubString(int beginIndex, int endIndex);
		
		String subString = s1.substring(2, 5);
		System.out.println(subString);
		
		
//		7. replace()  String s1 = "Testometer";
		
		System.out.println(s1.replace('o', 'z'));
		System.out.println(s1.replace("ete", "hhh"));
		
//		8. toUpperCase and toLowerCase;
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		
		
//		9. trim
		
		String s2 = "   Hello World..!!    ";
		
		System.out.println(s2);
		System.out.println(s2.trim());
		
		
//		10. indexOf();  String s1 = "Testometer";
		
		
		int index = s1.indexOf('t');
		System.out.println(index);
		
		
//		11. lastIndexOf()
		
		int index2 = s1.lastIndexOf('t');
		System.out.println(index2);
		
		
//		12.  Contains();  String s2 = "   Hello World..!!    ";
		
		boolean res = s2.contains("Lo wo");
		
		System.out.println(res);
		
//		13. toCharArray   String s1 = "Testometer";
		
		char[] charArr = s1.toCharArray();
		
		for( char c : charArr)
		{
			System.out.println(c);
		}
		
		
		
//		14. Split(); String s1 = "Testo,meter";
		
		
		 String[] splitString = s1.split("m");
		
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		
		
		
		
		
		
		
	}
}
