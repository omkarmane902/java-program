package example;

public class exp2 {

    String  brand; 
    double price;
    int  page;
    
    exp2()
    {
    	
    }
    
    exp2(String  brand,double price,int  page)
    {
    	this.brand = brand;
    	this.price = price;
    	this.page = page;
    }
    
    public void displayBook()
    {
    	System.out.println("brand :"+brand);
    	System.out.println("price :"+price);
    	System.out.println("page :"+page);
    	
    	System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
	
}
