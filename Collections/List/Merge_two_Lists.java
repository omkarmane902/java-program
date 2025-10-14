package List;

import java.util.ArrayList;
import java.util.List;

public class Merge_two_Lists {
	
	public static void main(String[] args) {
		
	
	List<Integer> l1 = new ArrayList<Integer>(List.of(1,2,3,4,5));
	List<Integer> l2 = new ArrayList<Integer>(List.of(6,7,8,9,10));
	
	List<Integer> l3 =  new ArrayList<Integer>(l1);
	
	l3.addAll(l2);
	
	System.out.println(l3);
	
	
	}
}
