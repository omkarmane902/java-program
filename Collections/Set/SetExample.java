package Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	
	public static void main(String[] args) {
		
		Set<String>  s = new HashSet<String>();
		
		
		    s.add("Apple");
		    s.add("Banana");
		    s.add("Mango");
		    s.add("Apple");
		    s.add("strawberry");
		    s.add("blueberry");
		    s.add("pineapple");
		    s.add("lemon");
		    s.add("guava");
		    s.add("kiwi");
		    s.add("Apple");
		    
		    
		    System.out.println(s);
		    
		    
		    
		    Set< String> s1 = new HashSet<String>();
		    
		    
		    s1.add("omkar");
		    s1.add("Milad");
		    s1.add("Sanket");
		    s1.add("abhi");
		    
		    
//		    System.out.println(s1);
		    
		    
		    
		    s.addAll(s1);
		    
		    System.out.println(s);
		    
		    
		    s1.remove("Sanket");
		    
		    System.out.println(s1);
		    
		    
		   // s1.clear();
		    
		    
		    
		    System.out.println(s1.isEmpty());
		    
		    
		    System.out.println(s1.retainAll(s));
		    
		    
		    System.out.println(s.equals(s));
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}
	
}
