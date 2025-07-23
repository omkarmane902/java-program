package nested_Exception_handling;

public class Exception_handling {
   public static void main(String[] args) {
  	 
	  try {
		int ans =  10 /0;
		
		System.out.println(ans);
		
	} catch (ArithmeticException e) {
      System.out.println(" 1) do not divide by zero");
      
      try {
    	  int ans =  10 /0;
  		
  		System.out.println(ans);
	} catch (ArithmeticException e2) {
		 System.out.println(" 2)do not divide by zero");
	}
      finally {
    	  System.out.println(" second finally block ");
    	  
    	  try {
    		  int ans =  10 /0;
    	  		
    	  		System.out.println(ans);
		} catch (ArithmeticException e3) {
			System.out.println(" 3)do not divide by zero");
		}
    	  finally {
    		  System.out.println("third finally block ");
		}
	}

	}
	  finally {
		  System.out.println("first finally block ");
		  
		  
		  try {
			  int ans =  10 /0;
  	  		
  	  		System.out.println(ans);
		} catch (ArithmeticException e2) {
			System.out.println(" 4)do not divide by zero");
		}
		  finally {
			  System.out.println("fourth finally block ");
		}
	}
 }
}
