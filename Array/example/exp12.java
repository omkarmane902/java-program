//give  element is how many time repeated

package example;



public class exp12 {

	
	public static int  countelement(int[]arr,int element)
	{
	   int count = 0;
	  	 for(int i =0; i<arr.length; i++)
	  	 {
	  		if(arr[i]==element)
	  		{
	  			count ++;
	  		}
	  	 }
	  	 return count;
	}
	
	public static void main(String[] args) {
		 
		
		int [] arr = {10,20,30,40,40,40,50,60};
		
		int element = 40;
		
		System.out.println(countelement(arr, element));
	}
	
	
}
