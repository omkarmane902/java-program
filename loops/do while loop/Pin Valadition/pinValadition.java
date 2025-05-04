import java.util.Scanner;
class pinValadition  
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int attement = 0;
		int stordPin = 9617;
		
		do
		{	
		System.out.println("Enter the password : ");
		int pin = sc.nextInt();	
		   if(pin==stordPin)
		   {
			System.out.println("Login Successfull");
			break;
		   }
          else
		  {
			System.out.println("Incoret password");  
		  }	
		  attement++;
		  
		}
		while(attement<4);
		
	}
}