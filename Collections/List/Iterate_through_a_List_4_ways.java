package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterate_through_a_List_4_ways {
	
	public static void main(String[] args) {
		
		
		List<Integer> ab = new ArrayList<Integer>(List.of(1,2,3,4,5,6,3,3,4,5));
		
		
		
		 // 1. For loop
			for(int i = 0 ; i < ab.size(); i ++)
		{
			System.out.print(ab.get(i) + ",");
	    }
		
			
			
			
			System.out.println();
			System.out.println();
			System.out.println();
			
		
		// 2. Enhanced for-each
		
		for(Integer I : ab)
			
		{
			System.out.print(I + ",");
		}
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		  // 3. Iterator
		
		Iterator<Integer> it = ab.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()  + ",");
			
		}
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		  // 4. forEach (Lambda)
		
		ab.forEach(om ->  System.out.println(om));
		
		
	}

}
