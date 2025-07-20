package multiinhirenre_in_using_interface_1;

public class instagram_2 extends instagram_1 {

	
	int massgesCount;
	long phono;
	String userName;
	
	public instagram_2() {
		// TODO Auto-generated constructor stub
	}
	
	instagram_2(long phono,String userName) {
		this.phono = phono;
		 this.userName = userName;
		 
		 System.out.println("Account is Created");
		 
	}
	
public void story(int phono, String massg) {
		
	   	if(massges>=massgesCount)
	   	{
	   		System.out.println(massg);
	   		System.out.println("massges send!");
	   		
	   		massgesCount++;
	   	}
	   	else
	   	{
	   		System.out.println("Daily limit End");
	   	}
		
	}
 
    public void sendmassges(int phono, String  textmassg)
    {
    	if(massges>=massgesCount)
	   	{
	   		System.out.println(textmassg);
	   		System.out.println("massges send!");
	   		
	   		massgesCount++;
	   	}
	   	else
	   	{
	   		System.out.println("Daily limit End");
	   	}
		
    	
	}

	
}
