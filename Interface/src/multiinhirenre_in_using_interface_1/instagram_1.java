package multiinhirenre_in_using_interface_1;

public abstract class instagram_1 implements instagram{

	int massgesCount;
	long phono;
	String userName;
	
	public instagram_1() {
		// TODO Auto-generated constructor stub
	}
	
	
	instagram_1(long phono,String userName)
	{
		 this.phono = phono;
		 this.userName = userName;
		 
		 
		 System.out.println("Account is Created");
	}
	
	
	@Override
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

	@Override
	public void sendreels(int phono, String reels) {
		if(massges>=massgesCount)
	   	{
	   		System.out.println(reels);
	   		System.out.println("reels send!");
	   	}
	   	else
	   	{
	   		System.out.println("Daily limit End");
	   	}
	}

}
