package example;



public class Remove_element_in_array {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50};
		
		int removeElement = 30;
		
		removeElementarray(arr, removeElement);
		
		
	}
	
	
	public static void removeElementarray(int [] arr , int element)
	{
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			
			if(element == arr[i])
			{
				for(int j = i ; j <arr.length-1; j++)
				{
					arr[j]=arr[j+1];
				}
				count ++;
				break;
			}
			
		}
		
		if(count ==0)
		{
			System.out.println("Element is not found");
		}
		
		
		
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if (i<arr.length-2)
			{
				System.out.print(arr[i]+",");
			}
			else
			{
				System.out.print(arr[i]);
			}
			
			
		}
		
		
	}
}
