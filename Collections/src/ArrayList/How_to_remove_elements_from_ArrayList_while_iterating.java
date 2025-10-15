package ArrayList;


import java.util.ArrayList;
import java.util.Iterator;

public class How_to_remove_elements_from_ArrayList_while_iterating {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext())
		{
			if(it.next() < 4)
			{
				it.remove();
			}
		}
		
		System.out.println(list);
		
		
	}

}
