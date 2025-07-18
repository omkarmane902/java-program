package multiinhirenre_in_using_interface;

public  abstract class Whatsappimp1 implements Whatsapp {
   int massageCount;
   String user;
   long phon;
   
   
   Whatsappimp1()
   {
	   
   }
   
   Whatsappimp1(String user,long phon)
   {
	  this.user = user;
	  this.phon = phon;
	  
	  System.out.println("Account is Created");
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

   
   public void voicemass(long phone, String masg) {
	
	   if(massageCount<=maslimit )
	   {
		  System.out.println(masg); 
		  System.out.println("voice massage Send");
		  
		  massageCount ++;
	   }
	   else
	   {
		   System.out.println("massage limet over");
	   }
	   
   }

   
   
   

   
   
}
