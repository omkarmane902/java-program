package example;

public class exp11 {

	
	public static int test( int []arr,int search)
	{
		
		for(int i = 0 ; i <arr.length;  i++)
		{
			if( arr[i]==search)
			{
				return i;
			}
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		int[] array = {10, 20, 30};
        int searchValue = 30;
        
        System.out.println(test(array, searchValue));
	}
}
