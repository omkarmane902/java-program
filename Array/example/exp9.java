

//check array is palindrome or Not

package example;

public class exp9 {
  
	
	
	

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,20,10}; 
		
		
		int i ,j;
		
		for(i = 0, j = arr.length-1; i < j; i++ , j-- )
		{
			if( arr[i]!=arr[j])
			{
				 
				 break;
			}

		}
		
		if (i<j)
		{
			System.out.println("Not a palindrome Array ");
		}
		else
		{
			 System.out.println("Palindrome Array ");
		}
		
		
		
	
		
	}
}
