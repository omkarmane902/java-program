package Lazy_instanciation;

public class computer {
        String brand;
        double price;
        String processer;
        int ram;
        int rom;
        
        prndrive p;
        
        
        public computer()
        {
        	
        }
        computer(String brand,double price,String processer,int ram,int rom)
        {
        	this.brand = brand;
        	this.price = price;
        	this.processer = processer;
        	this.ram  = ram;
        	this.rom = rom;
        }
        
        public void prndrive(String brand, int memory, int speed, double price)
        {
            p = new prndrive(brand, memory, speed, price);
        }
        public void Displayprndrive()
        {
        	System.out.println("brand :"+brand);
        	System.out.println("price :"+price);
        	System.out.println("processer :" +processer);
        	System.out.println("ram :"+ ram);
        	System.out.println("rom :" + rom);
        	System.out.println("========================================");
        }
}
