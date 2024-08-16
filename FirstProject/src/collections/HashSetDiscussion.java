package collections;

import java.util.HashSet;

public class HashSetDiscussion {
	
	
	public static void main(String[] args) {
		
		
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(20);
		set1.add(25);
		set1.add(30);
		set1.add(35);
		set1.add(20);
		set1.add(40);
		
		
		System.out.println(set1);
		
//		****** remove ******
		
		
		boolean isRemoved = set1.remove(30);
		System.out.println("isRemoved :" + isRemoved);
		
		System.out.println(set1);
		
		
		
//		****** size ******
		
		System.out.println(set1.size());
		
		
		
//		****** conatains  ******
		
		System.out.println(set1.contains(200));
		
		
//		 ****** iterate over hashset ******
		
		for(Integer data : set1)
		{
			System.out.print(data + " ");
		}
		
		
		
		
		
		
	}
	
	
	

}
