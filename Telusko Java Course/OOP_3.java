class Mobile{

    // Everytime we create an object there are two steps: 
    // 1. Class Loads                   (Done by Class Laoders)
    // 2. Object are instantialized     (Done by Constructor of a class)

    String brand; 
    int price; 
    String name;

    // This variable belongs to the class and not the instances of this class, which also means that this variable is shared among all the objects of this class.
    static String category;      

    // This is a static block which is used to define all the values of the static variable of a class. 
    // A static block is only called once unlike a constructor which is called every time a new object is created. 
    // Note: If we use a Class.forName() method to load a class dynamically only the static block runs and the constructor does, as it assigns value to all the static attributes and the constructor is only required when we try to create an instances. In order to load a class to memory the constructor isn't required. 
    static{
        category = "SmartPhone";
        System.out.println("Mobile Static Ran!");
    }


    // This is a constructor, it is called every time we create a new object of a particular class. 
    // A default constructor is used to populate the instances variables of a class with some default values. 
    public Mobile(){
        brand = "";
        price = 5000;
        System.out.println("Mobile Construct Ran!");
    }

    public Mobile(String BrandName, String DeviceName, int DevicePrice){
        brand = BrandName;
        name = DeviceName;
        price = DevicePrice;
    }

    public void show(){
        System.out.println("\n" + brand + ": " + name + ": " + price + " (Category: " + category + ")");
    }

    // This is a static method which means that we can call this method directly using this class without needing to create an instances of this class. 
    public static void showcategory(){
        System.out.println(category);
    }

    // Using instances variables within a static method
    // In order to be able to use non-static variables within a static method we need to have an object reference which we can achieve by passing the object as a parameter.
    public static void showlist(Mobile obj){
        System.out.println("\nbrand: "+obj.brand);
        System.out.println("name: "+obj.name);
        System.out.println("price: "+obj.price);
    }

}


public class OOP_3 {
    public static void main(String[] args) throws ClassNotFoundException {
        
        // Class.forName("Mobile");     // This will load this class in the class loader which will call the static block. 

        // Creating an object using the default constructor. 
        Mobile mobobj = new Mobile();
        mobobj.show();


        Mobile mobobj2 = new Mobile("Xiaomi", "Redmi Note 13", 19000);
        mobobj2.show();


        // This is a static method as a result in order to call this method we don't need to create an instances of the class. 
        Mobile.showcategory();  


        // Calling an static method that uses the instances variables as a result we need to pass the instances that we want to view. 
        Mobile.showlist(mobobj2);

    }
}
