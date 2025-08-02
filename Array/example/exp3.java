package example;

public class exp3 extends exp2 {
   public static void main(String[] args) 
   {
	
	   exp2 [] b1 = new exp2[3];
	   
	   
	   b1[0] = new exp2("classmeat",150.0,300);
	   b1[1] = new exp2("camlin",120.0,200);
	   b1[2] = new exp2("youy",80.0,100);
	   
	   for(int i = 0; i<b1.length; i++)
	   {
		 
		  b1[i].displayBook(); 
	   }
	  
  }
}
