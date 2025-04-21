import java.util.Scanner;
class GymTimetable
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------Gym Time table-------------------");
		System.out.println("1 = Monday");
		System.out.println("2 = Tuesday");
		System.out.println("3 = Wednesday");
		System.out.println("4 = Thursday");
		System.out.println("5 = Thursday");
		System.out.println("6 = Saturday");
		System.out.println("7 = Sunday");
		
		System.out.println("Enter your day");
		int day = sc.nextInt();
		
		switch(day)
		{
			case 1:
			{
			System.out.println(" Push- Chests and Triceps.");
             break;			
			}
			case 2:
			{
			System.out.println("Pull - Back and Biceps. ");	 
			 break;
			}
			case 3:
			{
			System.out.println("Legs - Hamstrings. ");
            break;			
			}
			case 4:
			{
			System.out.println("Shoulders and Abs. ");
             break;			
			}
			case 5:
			{
			System.out.println("Push Pull Superset. ");
               break;			
			}
			case 6:
			{
			System.out.println("Legs - Quads. ");
              break;			
			}
			case 7:
			{
			System.out.println("Rest day");
             break;			
			}
			default:
			{
			System.out.println("Invalid input");	
			}
		}
		
	}
}