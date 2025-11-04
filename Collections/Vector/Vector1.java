package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<Integer>();
		
				
				v.add(111);
				v.add(221);
				v.add(323);
				v.add(41);
				v.add(15);
				v.add(61);
				v.add(73);
				v.add(48);
				v.add(922);
				v.add(100);
				
				
				v.add(3, 11);
				
				System.out.println(v.get(3));
				
				System.out.println(v.elementAt(3));
				
				System.out.println(v.firstElement());
				
				System.out.println(v.lastElement());
				
				v.set(2, 222);
				
				
				v.remove(4);
				
				//v.removeAllElements();
				
			  System.out.println(v.contains(48));
			  
			  
			  System.out.println(v.indexOf(922));
			  
			  System.out.println(v.indexOf(100, 9));
			  
			  System.out.println(v.size());
			  
			  System.out.println(v.isEmpty());
			  
			  
			  
			  Iterator<Integer> it = v.iterator();
			
			  
			  while(it.hasNext())
			  {
				  System.out.print(it.next() );
			  }
			  
			  
				
				
				
				
				
				
				//System.out.println(v);		
	}
	
}
