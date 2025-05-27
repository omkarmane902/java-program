class recurssionPower
{
	public static void main(String [] args)
	{
		System.out.println(power(5,3));
	}
	public static int power (int base , int raise)
	{
		return raise == 0 ? 1 : base * power(base,raise-1) ;
	}
}