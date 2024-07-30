// Interface: An interface is a reference type, similar to an abstract class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are used to specify a set of methods that a class must implement, providing a way to achieve abstraction and multiple inheritance. In an interface dy default all the methods are of public abstract type. 

// Class ---> Class             extends
// Interface ---> Interface     extends
// Class ---> Interface         implements



interface A{

    // Final and Static
    int age = 19;               // An instance variable in an interface is final which means that we cannot reassign them later on they are constants.
    String area = "Kolkata";    // And as they are static we can also access them without creating an object of interface type.

    // public abstract void show();        // Not mentioning the public abstract keywords would have made no difference as by default in interface the methods are of public abstract type. 

    // public abstract by detault as it's an interface.    
    void show();
    void config();     

}


interface X{
    void stop();
}

// Inheritance among interfaces is possibel through the extends keyword, we should keep in mind that multiple inheritance is also supported among interfaces.
interface Y extends X{
    void run();
}


// In order for this class to be a normal concrete class it would need to define/implement all the methods that are there. 
// If this class doesn't implement or define even one of all the available methods of the interface it is implementing from this class would have to be of abstract type otherwise the compiler will throw an error. 

// Multiple implementation (inheritance) is supported in class to interfaces. In other words a class can implement from multiple interfaces. 

class B implements A, Y{

    public void show(){
        System.out.println("In show");
    }

    public void config(){
        System.out.println("In Config");
    }

    public void stop() {
        System.out.println("In stop");
    }

    public void run() {
        System.out.println("In run");
    }


}


public class OOP_13_Interface{
    public static void main(String[] args){
        
        A obj = new B();    // Reference Type: A     &     Object type: B
        
        // The methods of interface X and Y are unknown to A as a result we cann't call those methods on an object with A reference type.
        // obj.stop(); 
        // obj.run();
        // Calling both or any of these will throw error as they are unknown to the A interface. 

        obj.show();
        obj.config();


        // If we want to use all the functions we should use a reference type while object creating that is aware of all the functionality (methods) of class. 
        B obj2 = new B();

        System.out.println("\nReference Type and Object Type: B");
        obj2.show();
        obj.config();
        obj2.stop();
        obj2.run();


    }
}