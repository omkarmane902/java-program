package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetexample {

	
	public static void main(String[] args) {
		
		
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		
		System.out.println(ts);
		
		
		ts.remove(60);
		
		System.out.println(ts);
		
		System.out.println(ts.contains(30));
		
		System.out.println(ts.size());
		
		System.out.println(ts.isEmpty());
		
		//ts.clear();
		
		System.out.println(ts);
		
		System.out.println(ts.first());
		
		System.out.println(ts.last());
		
		System.out.println(ts.higher(30));
		
		System.out.println(ts.lower(30));
		
		System.out.println(ts.ceiling(25));
		
		System.out.println(ts.floor(25));
		
		
		System.out.println(ts.pollFirst());
		
		
		System.out.println(ts.pollLast());
		
		Iterator<Integer> it = ts.iterator();
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(ts.descendingSet());
	}
}
