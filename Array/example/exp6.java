//print array in reverse order and print (,) but in  last not
public class exp6 {
 public static void main(String[] args) {
	 
	 int [] arr = {10,20,30,40,50,60,70};
	 
	 
	 for(int i = arr.length-1; i >= 0; i--)
	 {
		 System.out.print(arr[i] );
		 
		 if(i > 0)
		 {
			System.out.print(","); 
		 }
	 }
	
  }
}
