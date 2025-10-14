package List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_a_List_in_ascending_and_descending_order {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>(List.of(4,5,3,4,9,2,1,4,6,8,4));
		
		
		 // Ascending
		
//       	Collections.sort(l1);
//		
//		System.out.println(l1);
		
		
		// Descending
		
		Collections.sort(l1,Collections.reverseOrder());
		
		System.out.println(l1);
		
		
	
		
		
		
		
		
		
	}

}
