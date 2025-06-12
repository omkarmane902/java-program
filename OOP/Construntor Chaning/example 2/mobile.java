class mobile {
    String brand;
    int ram;
    int rom;
    String model;
    String process;

    
    mobile() 
	{
    }

    
    mobile(String brand, int ram, int rom)
	{
        this.brand = brand;
        this.ram = ram;
        this.rom = rom;
    }

    
    mobile(String brand, int ram, int rom, String model) 
	{
        this(brand, ram, rom); 
        this.model = model;
    }

    
    mobile(String brand, int ram, int rom, String model, String process)
	{
        this(brand, ram, rom, model); 
        this.process = process;
    }

    
    public void displaymobile() 
	{
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("ROM: " + rom + "GB");
        System.out.println("Model: " + model);
        System.out.println("Processor: " + process);
		System.out.println("================================================================");
    }
}

