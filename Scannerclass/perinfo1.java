import java.util.Scanner;

class perinfo1
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your personal information");
		
		
		System.out.println("Enter your  Name :");
		String Name  = sc.next();
		
		
		System.out.println("Enter your address :");
	    String address = sc.next();
		
		
		System.out.println("Enter your Phone number :");
		long PhoneNumber = sc.nextLong();
		
		
		System.out.println("Enter your Age :");
		int Age = sc.nextInt();
		
		
		System.out.println("Enter your Collage name Short from:");
		String CollageName = sc.next();
		
		System.out.println("Enter your CGP :");
		double CGP = sc.nextDouble();
		
		
		System.out.println("Your personal information");
		
		System.out.println("Name :" +Name);
		System.out.println("address :"+address);
		System.out.println("Phone Number"+PhoneNumber);
		System.out.println("Age"+Age);
		System.out.println("Collage Name"+CollageName);
		System.out.println("CGP:" +CGP);
		
		
		
		
		
	}
	
}