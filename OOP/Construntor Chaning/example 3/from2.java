class from2 
{
    String name;
    int age;
    String email;
    String dob;
    long phNO;
    String location;
    long telphNO;
    String temploc;

    from2() 
	{
		
	}

    from2(String name, int age, String email, String dob)
	{
        this.name = name;
        this.age = age;
        this.email = email;
        this.dob = dob;
    }

    from2(String name, int age, String email, String dob, long phNO) 
	{
        this(name, age, email, dob);
        this.phNO = phNO;
    }

    from2(String name, int age, String email, String dob, long phNO, String location) 
	{
        this(name, age, email, dob, phNO);
        this.location = location;
    }

    from2(String name, int age, String email, String dob, long phNO, String location, long telphNO) 
	{
        this(name, age, email, dob, phNO, location);
        this.telphNO = telphNO;
    }

    from2(String name, int age, String email, String dob, long phNO, String location, long telphNO, String temploc)
	{
        this(name, age, email, dob, phNO, location, telphNO);
        this.temploc = temploc;
    }

    public void displayfrom2() 
	{
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("DOB: " + dob);
        System.out.println("Phone Number: " + phNO);
        System.out.println("Location: " + location);
        System.out.println("Telephone Number: " + telphNO);
        System.out.println("Temporary Location: " + temploc);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
