package multiinhirenre_in_using_interface;

public class Whatsappimp2 extends Whatsappimp1 {
  
	
	Whatsappimp2()
	{
		
	}

	Whatsappimp2(String user,long phon)
	{
		super(user,phon);
	}
	
	public void massage(long phone, String masg) {
		
		
		   if(massageCount<=maslimit )
		   {
			  System.out.println(masg); 
			  System.out.println("Text massage Send");
			  
			  massageCount ++;
		   }
		   else
		   {
			   System.out.println("massage limet over");
		   }
		   
	   }
	
	
	public void status( String ip) {
		System.out.println(ip);
		System.out.println("Status update ! ");
		
	}
	
	
}
