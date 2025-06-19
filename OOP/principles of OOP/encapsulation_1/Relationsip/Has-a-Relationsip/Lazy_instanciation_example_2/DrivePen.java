package Lazy_instanciation_example_2;

public class DrivePen {
 public static void main(String[] args) {
	Pen p = new Pen("Parker",120.75,"Blue","Medium");
	p.DisplayPan();
	
	p.Refill("Parker-Refill",15.50,"Blue","Standard");
	p.r.displayRefill();
}
}
