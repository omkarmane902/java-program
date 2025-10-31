package example;

public class panDriver {

	
	public static void main(String[] args) {
		
		pan pan1 = new pan();
		
		pan1.colour = "blue";
		
		pan1.price = 20.20;
		
		
		
		pan pan2 = new pan();
		
		pan2.colour = "red";
		
		pan2.price = 40.20;
		
		
		
		pan1.colourInfo();
		
		pan2.priceInfo();
		
	}
}
