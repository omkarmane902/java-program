//म्हणजेच, जो शेवटी टाकला (Insert केला) तोच सर्वात आधी बाहेर (Remove) काढला जातो.

package Stack;

import java.util.Stack;

public class Stack1 {
	
	
	public static void main(String[] args) {
		
		Stack<String> animal =new Stack<String>();
		
		
		animal.push("Tiger");
		animal.push("Lion");
		animal.push("Dog");
		animal.push("Horse");
	    animal.push("Cat");
	      
	    
	    System.out.println("animal : "+animal);
	    
	    
	    System.out.println(animal.peek());
	    
	    
	    
	    System.out.println(animal.pop());
	    
	    System.out.println(animal);
	    
	    System.out.println(animal.peek());

	}

}
