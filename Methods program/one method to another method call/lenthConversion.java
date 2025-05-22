class lenthConversion
{
	public static void main(String[] args)
	{
	  CentimeterToMeter(1000);	
	}
	public static void CentimeterToMeter(double cent)
	{
	  double mtr = cent/100;
      System.out.println("Meter :" + mtr);
      MeterToInch(mtr);	  
	}
	public static void MeterToInch(double mtr)
	{
	    double inch = mtr*39.3701;
		System.out.println("Inch :"+inch);
		InchTOFoot(inch);
	}
	public static void InchTOFoot(double inch)
	{
		double foot = inch/100;
		System.out.println("Foot:"+foot);
	}
	
}