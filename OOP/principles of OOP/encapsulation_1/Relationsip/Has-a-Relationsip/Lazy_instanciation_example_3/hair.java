package Lazy_instanciation_example_3;

public class hair {
      String haircolour;
      double length;
      String style;
       
      
      public hair()
      {
		
	 }
      hair(String colour,double length,String style)
      {
    	 this.haircolour = colour;
    	 this.length = length;
    	 this.style = style;
    	 
      }
      public void dispayhair() {
		System.out.println("haircolour :" +haircolour);
		System.out.println("length :" + length);
		System.out.println("style :" + style );
		System.out.println("======================");
	}
}
