package List;

import java.util.ArrayList;

import java.util.List;

public class Search_for_an_element_in_a_List {

	public static void main(String[] args) {
		
		
		
		List<Integer> l1 = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7));
		
		
		int search = 4 ;
		
		if(l1.contains(search))
		{
			System.out.println(search + " found in the list!");
		}
		else
		{
			System.out.println(search + " not found!");
		}
			
		
		
	
	}
	
	
}
