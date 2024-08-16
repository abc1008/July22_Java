package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDiscussion {
	
	
	
	public static void main(String[] args) {
		
//		ArrayList<DataType> listName = new ArrayList< DataType>();
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(20);
		list1.add(25);
		list1.add(30);
		list1.add(35);
		list1.add(40);
		list1.add(35);
		list1.add(40);
		
		System.out.println(list1);
		
		
	    Integer num1 = list1.get(2);
		System.out.println(num1);
		
		
		
//		**** Remove ******
		
		Integer removedEle = list1.remove(3);
		System.out.println("removedEle : "+ removedEle);
		System.out.println(list1);
		
		
//		****** set ******
		
		list1.set(3, 50);
		System.out.println(list1);
		
		
		
//		 ******* size
		
		System.out.println(list1.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
