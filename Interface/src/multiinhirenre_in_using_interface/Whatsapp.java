package multiinhirenre_in_using_interface;

public interface Whatsapp {

	int maslimit = 100;
	void massage(long phone , String masg);
	void voicemass(long phone , String masg);
	
	void status( String ip);
	
	public static void greetings(String name)
	{
		System.out.println("hiiiiiiiiiiiiii"+name+"welcome to Whatsapp");
	}
}
