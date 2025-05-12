
import java.util.Scanner;
class hcm
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first numbers :");
		int firstvalue = sc.nextInt();
		
		System.out.print("Enter the second numbers :");
		int secondvalue = sc.nextInt();
		
        int small = (firstvalue < secondvalue)? firstvalue:secondvalue;
		while(true)
		{
			if(firstvalue%small==0 && secondvalue%small==0)
			{
					System.out.println("Thise is LCM number" +small);
					break;
	
			}
			small--;
		}
		
	}
}