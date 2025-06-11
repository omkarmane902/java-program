class DriveFrom
{
	public static void main (String [] args)
	{
		From f1 = new From("omkar",22,8625906485l,"omkarmane@gmail.com","Yadrav");
		f1.Displayfrom();
		
		From f2 = new From("omkar",22,8625906485l,"omkarmane@gmail.com","Yadrav","AB+");
	    f2.Displayfrom();
		
		From f3 = new From("omkar",22,8625906485l,"omkarmane@gmail.com","Yadrav","AB+",2345678912l,"Pune");
	    f3.Displayfrom();
	}
}