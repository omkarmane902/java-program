package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class example1 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();

		hs.add("omkar");

		hs.add("abhi");

		
		hs.add("chinmay");

		hs.add("abhay");

		hs.add("amit");

		hs.add("omkar"); // not add duplicate value

		System.out.println(hs);

		hs.remove("abhi"); // boolen

		System.out.println(hs.contains("amit")); // boolen

		System.out.println(hs.isEmpty()); // boolen

		System.out.println(hs.size()); // int

		Iterator<String> it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// hs.clear();

		HashSet<String> hs1 = new HashSet<>();

		hs1.add("bapu");

		hs1.add("somnath");

		hs1.add("avi");

		hs1.add("omkar");

		hs1.add("abhay");

		hs1.add("amit");

		
		hs.addAll(hs1);

		// hs.removeAll(hs1);

		System.out.println(hs1.retainAll(hs));

		System.out.println(hs);

	}

}
