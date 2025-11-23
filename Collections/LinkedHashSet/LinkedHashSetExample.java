package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		lhs.add("omkar");

		lhs.add("yash");

		lhs.add("abhi");

		lhs.add("meghraj");

		lhs.add("yuraj");

		lhs.add("omkar");

		lhs.remove("meghraj");

		System.out.println(lhs.contains("abhi"));

		System.out.println(lhs.size());

		System.out.println(lhs.isEmpty());

		// lhs.clear();

		Iterator<String> it = lhs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		
		lhs1.add("om");

		lhs1.add("yas");

		lhs1.add("abh");

		lhs1.add("raj");
		
		
		lhs.addAll(lhs1);
		
		
		//lhs.removeAll(lhs1);
		
		lhs.retainAll(lhs1);
		
		
		

		System.out.println(lhs);
	}
}
