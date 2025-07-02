package Super_keyword;



public class son extends Father {
   String name = "Omkar";
   
   public void Display()
   {
	   System.out.println(name); //Omkar
	   System.out.println(super.name); //Dhanaji 
	   
	   super.Display(); //Dhanaji
   }
}
