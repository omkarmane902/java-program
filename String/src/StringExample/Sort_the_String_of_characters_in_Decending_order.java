package StringExample;

public class Sort_the_String_of_characters_in_Decending_order {

	public static void main(String[] args) {
		
		String s1 = "omkar mane";
		
		char [] arr = s1.toCharArray();
		
		
		 for(int i = 0; i < arr.length; i++)
		 {
			for (int j = 0; j < arr.length-i-1; j++) {
				
				if(arr[j]  <  arr[j+1])
				{
					
					char temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
				}
			} 
		 }
		 
		 String s2 = new String(arr);
		 
		 
		 System.out.println(s2);
	}
}
