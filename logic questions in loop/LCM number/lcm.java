// LCM full form is least common multiple,which is the smallest numberb that is divisible by numbers intered by user
import java.util.Scanner;
class lcm
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first numbers :");
		int firstvalue = sc.nextInt();
		
		System.out.print("Enter the second numbers :");
		int secondvalue = sc.nextInt();
		
        int lcm = (firstvalue > secondvalue)? firstvalue:secondvalue;
		while(true)
		{
			if(lcm%firstvalue==0 && lcm%secondvalue==0)
			{
					System.out.println("Thise is LCM number" +lcm);
					break;
	
			}
			lcm++;
		}
		
	}
}