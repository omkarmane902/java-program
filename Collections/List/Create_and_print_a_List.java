package List;

import java.util.ArrayList;
import java.util.List;

public class Create_and_print_a_List {
	
	
	public static void main(String[] args) {
		
		
		List<String> l1 = new ArrayList<String>();
		
		
		l1.add("omkar");
		l1.add("Dhanaji");
		l1.add("Mane");
		l1.add("abhi");
		l1.add("meghraj");
		l1.add("omkar");        // duplicate allowed
		l1.add("omkar");       // duplicate allowed
		l1.add("dhanaji");    // duplicate allowed
		
		
		
		System.out.println(l1);
	}

}
