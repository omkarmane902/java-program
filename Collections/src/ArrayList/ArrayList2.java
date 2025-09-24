package ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList2 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("D");
		list.add("H");
		list.add("I");
		list.add("J");
		
		System.out.println(list);
		
		
		
		list.remove(9);
		System.out.println(list);
		
		
		System.out.println(list.get(2));
		
		
		int size = list.size();
		
		
		System.out.println(size);
		
		
		System.out.println(list.contains("D"));
		
		System.out.println(list.contains("M"));
		
		
		
		  
		ArrayList<String>list2 = new ArrayList<String>();
		
		list2.add("omkar");
		list2.add("Dhanaji");
		list2.add("Mane");
		list2.add("onkar");
		
		
		
		Collections.sort(list2);
		System.out.println(list2);
		
		
        list2.set(3, "ijio");
        System.out.println(list2);
		
		
		ArrayList<String>list3 = new ArrayList<String>();
		
		list3.add("J");
		list3.add("I");
		list3.add("H");
		list3.add("G");
		list3.add("F");
		list3.add("E");
		list3.add("D");
		list3.add("C");
		list3.add("B");
		list3.add("A");
		
		
		
		
		Collections.sort(list3);
		
		System.out.println(list3);
		
		
		
		
	for (int i = 0; i < list3.size(); i++)
	{
		System.out.println("This is Element : "+ list3.get(i));
	}
		
	}
}
