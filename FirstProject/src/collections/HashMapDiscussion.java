package collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapDiscussion {

	
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<>();
		
		map1.put(101, "abc");
		map1.put(102, "pqr");
		map1.put(103, "def");
		map1.put(104, "tuv");
		map1.put(105, "qwe");
		
		System.out.println(map1);
		
		
		String value = map1.get(104);
		System.out.println(value);
		
		
		
//		**** remove ****
		
		 String removedValue = map1.remove(103);
		 System.out.println("removedValue : "+removedValue);
		 
		 System.out.println(map1);
		 
		 
		 
//		 **** keyset ****
		 
		 Set<Integer> keysFromMap1 = map1.keySet();
		 
		 System.out.println(keysFromMap1);
		 
		 
//		 **** containsKey and containsValue ****
		 
		 System.out.println(map1.containsKey(102));
		 System.out.println(map1.containsValue("tuv"));
	}
	
	
	
	
	
	
}
