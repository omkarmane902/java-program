package ArrayList;


import java.util.ArrayList;
import java.util.Collections;





public class ArrayList1 {

	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		
		
	 // add element in array
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println(list);
		
		
		// add 1 element
		
	    list.add(60);
		
		System.out.println(list);
		
		
		// replace element  20 to 200  
		
		list.add(1, 200);
		
		System.out.println(list);
		
		
		// add one new array in same array
		
		
		
		ArrayList<Integer> newlist =new ArrayList<Integer>();
		
		newlist.add(70);
		newlist.add(80);
		newlist.add(90);
		
		
	    list.addAll(newlist);
	    
	    
	    System.out.println(list);

	    
	    
	    //get the element of given array
    
	    
	    System.out.println(list.get(1));
	    
	    
	    // remove the element using index in array 
	    
	    
	  list.remove(1);
  
	  System.out.println(list);
	    
	    
	    // remove the element in array 

	    
	  
	 list.remove(Integer.valueOf(20));
	 
	 System.out.println(list);
	 
	 
	 
	 //Clear all array
	 
	 
//	 list.clear();
//	 
//	 System.out.println(list);
//	 
	 
	 //update the value
	 
	 
	 list.set(2, 5000);
	 System.out.println(list);
	 
	 
	 //check the element is present or not 
	 
	 
	
	 
	 System.out.println( list.contains(50));
	 
	 // ettrect the array
	 
	 for (int i = 0; i < list.size(); i++)
	 {
		 System.out.println("The element is : " + list.get(i));
	 }
	 
	 //check the size 
	 
	 int size = list.size();
	 
	 System.out.println(size);
		
	 
	 //sorting 
	 
	 Collections.sort(list);
	 
	 System.out.println(list);
	 

		
		 
		
	}
}
