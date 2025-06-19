package Lazy_instanciation_example_3;

public class HumanDriver {
	public static void main(String[] args) 
	{
		human h = new human("Black", 175.5, 80);
		h.displayhuman();
		
		h.hair("black",2.0,"straight");
		h.h1.dispayhair();
	}
	

}
