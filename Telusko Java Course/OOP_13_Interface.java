// Interface: An interface is a reference type, similar to an abstract class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are used to specify a set of methods that a class must implement, providing a way to achieve abstraction and multiple inheritance. In an interface dy default all the methods are of public abstract type. 

// Notes on Interface: 
// Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
// Interface methods do not have a body - the body is provided by the "implement" class
// On implementation of an interface, you must override all of its methods
// Interface methods are by default abstract and public
// Interface attributes are by default public, static and final
// An interface cannot contain a constructor (as it cannot be used to create objects)

// Why And When To Use Interfaces?
// 1) To achieve security - hide certain details and only show the important details of an object (interface).
// 2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below class B which inherits from both A and Y interfaces).


// Inheritance                // Keyword:
// Class ---> Class             extends 
// Interface ---> Interface     extends
// Class ---> Interface         implements

// An interface cannot inherit from a class, interfaces can only inhert from other interfaces. In other words a super interface has to be an interface only. Though an abstract class is a lot similar to an interface, an interface cannot inherti from an abstract class either. 

// Also jsut like in class inhertitance the terminologies kind of stay the same:  
// The interface from which other interface is inheriting is called the Super interface / Parent interface
// The interface which is inheriting from an interface is called  the Sub interface / Child interface
// As multiple inheritance is supported in interfaces an interface can have more than one parent interface. 

abstract class NewClass{
    public abstract void sound();
}

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