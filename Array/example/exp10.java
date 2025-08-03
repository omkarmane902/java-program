//check the element is present in array or not

package example;

public class exp10 {

	public static void main(String[] args) {
		
	int [] arr = {10,20,30,40,50};	
		
     int search = 30;
     int i;
     for(i = 0 ; i <arr.length;  i++)
     {
    	  if(arr[i]==search)
    	  {
    		 break;  
    	  }
     }
     if(i==arr.length)
     {
    	System.out.println("Element is not found"); 
     }
     else
     {
    	 System.out.println("Element is  found"); 
     }
	}
}
