class Mobile{
    String brand;       // These variables are called instances variable. 
    int price; 
    String name;
    
    static String category;    // Static variables are shared by different objects of the class.
    // This variable is static which means that this variable is common to all the instances of this class.
    // Static variable belongs to a class and not an object.

    public void show(){
        int UID = (int)(Math.random()*1001); // A variable creted within a method is called a local variable 

        System.out.println(UID + ": " + brand + ": " + name + ": " + price + " (Category: " + category + ")");
    }
}

public class OOP2 {
    public static void main(String[] args){
        
        Mobile.category = "SmartPhone";        // Setting the value of the static variable category once for one instance of the class mobile will make all the instances of this class have this value until it is changed again. 

        // Static variable should be called with their class name and not with their object names. 
        // Correct: Mobile.category = "Smartphone";
        // Incorrect: mobobj1.category = "Smartphone"; X X X  ----> This is NOT RECOMMENDED.
        
        Mobile mobobj1 = new Mobile();
        mobobj1.brand = "Xiaomi";
        mobobj1.price = 19000;
        mobobj1.name = "Poco X6";
        

        Mobile mobobj2 = new Mobile();
        mobobj2.brand = "Realme"; 
        mobobj2.price = 17000; 
        mobobj2.name = "Narzo 70";

        Mobile mobobj3 = new Mobile(); 
        mobobj3.brand = "Samsung"; 
        mobobj3.price = 20000;
        mobobj3.name = "Galaxy M35";

        mobobj1.show();
        mobobj2.show();
        mobobj3.show();
    }    
}
