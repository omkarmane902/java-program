//   find max value in array
package example;



public class exp15 {

	public static void main(String[] args) {
		
		
		
		int [] arr = {10,20,30,40,20,2};
		int max = Integer.MIN_VALUE;
		
		
		for(int i = 0 ; i<arr.length; i++ )
		{
			if ( arr[i]> max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
