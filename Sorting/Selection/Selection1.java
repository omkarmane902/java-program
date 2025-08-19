package Selection;

import java.util.Arrays;

public class Selection1 {

	
	
	public static void main(String[] args) {
		
		
		int [] arr = {29,10,14,37,13};
		
		for (int i = 0; i < arr.length-1; i++) {
			
			
			int smallest = i;
			
			for (int j =i+1; j < arr.length; j++) {
				
				if(arr[smallest] > arr[j])
				{
					smallest = j;
				}
				
			}
			
			int temp = arr[smallest];
			
			arr[smallest]= arr[i];
			
			arr[i]= temp;
			
		}
		
		
		System.out.println(Arrays.toString(arr));
	}
}

