package example;

public class exp1 {

	
	public static void main(String[] args) {
		
		
		int [] arr = {10,20,30,40,50,60};
		
	   for(int i = 0 ; i <arr.length; i++ )
	   {
		   if (i<arr.length-1) {
			   
			   System.out.print(arr[i]+",");
		} 
		   else
		   {
            
			   System.out.println(arr[i]);   
		   }
	   }
	}
}
