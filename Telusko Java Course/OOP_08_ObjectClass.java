
// If any class doesn't have a parent class by default the Object Class will be parent class of that class. Or in other words any class which doesn't have a parent class is a child class or we can say is extended from the Object class. 

class Laptop{
    String model; 
    int price;

    // Creating a method with the same signature as the method from the Object class will help us perform method overriding. 
    // Which means that evenever we call this method on an object of laptop class, this particular method will be called and not the Object Class's one.
    // public String toString(){
    //     return "Hey!";
    // }

    
    @Override       // Annotation
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
    
}


public class OOP_08_ObjectClass {
    public static void main(String[] args){
        
        Laptop obj = new Laptop();
        obj.model = "Asus Tuf 17";
        obj.price = 130000;

        Laptop obj2 = new Laptop(); 
        obj2.model = "Asus Tuf 17"; 
        obj2.price = 130000;

        // the .toString() method belongs to the Object Class and as Laptop class is a sub class of it we get to use .toSting() with it. 
        // using .toSting() after the obejct is the same as simply printing the object. 
        System.out.println(obj.toString());     // Any time we print an object we get the name of the class it belongs to followed by the name of the class it has been initialized from.
        System.out.println(obj.equals(obj2));
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

    }           
}
