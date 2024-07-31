enum Laptop{
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);

    private int price; 

    private Laptop(int price){      // We can have a constructor of enum as well. 
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}

public class OOP_17_Enum {
    public static void main(String[] args) {
        
        // Laptop machine = Laptop.Macbook;
        // System.out.println(machine + " : " +machine.getPrice());

        // machine.setPrice(20);
        // System.out.println(machine.getPrice());

        for(Laptop device: Laptop.values()){
            System.out.println(device.ordinal() + " : " + device + " : " + device.getPrice());
        }

    }
}
