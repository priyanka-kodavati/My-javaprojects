package assignment2;

public class FruitJuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    
    public FruitJuice() 
    {
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }
    
    public void input() {
        
        flavour = "Guava";
        pack_type ="tetrapack";
        product_code =001;
        pack_size=500;
        product_price =150;
        
    }
    
    public void discount() {
        product_price -= 10;
    }
    
    public void display() {
        System.out.println("the Product Code: " + product_code);
        System.out.println("the Flavour: " + flavour);
        System.out.println("the Pack Type is: " + pack_type);
        System.out.println("the Pack Size is in ml: " + pack_size);
        System.out.println("the Product Price is rupees: " + product_price);
    }
    
    public static void main(String args[]) {
        FruitJuice obj = new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}
