//   find MIN value in array

package example;

public class exp16 {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,20,2,92,84,1,87489};
		
		int min = Integer.MAX_VALUE;
		
		
		for(int i = 0 ; i < arr.length; i++)
		{
			if(arr[i]< min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
