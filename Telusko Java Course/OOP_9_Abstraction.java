// Abstract Class: An abstract class is a class that cannot be instantiated on its own and is intended to be subclassed. It may contain abstract methods, which are methods without an implementation, and/or concrete methods, which have an implementation.
// In order to have an Abstract method we would definitely need an Abstract Class but it doesn't necessarily mean that an Abstract Class need to have Abstract methods only. An Abstract Class can also have concrete methods within. 
// If a normal class inherits from an Abstract class it would need to implement all the abstract methods available in it's parent Abstract Class otherwise the compiler will throw an error and it won't be a concrete class. And if we totally need the sub class of the Abstract class to not implement all the abstract methods of the super Abstract class we would need to make the sub class as an Abstract class as well.

// Abstact Method: An abstract class can contain abstract methods, which are declared without an implementation (i.e., without a body).



// Concrete Class: A concrete class is a class that has an implementation for all of its methods and can be instantiated. It may extend an abstract class and must provide implementations for all abstract methods of the superclass.
// A concrete class must provide implementations for all inherited abstract methods from its superclass.
// A concrete class can extend another class (either abstract or concrete) and can itself be subclassed.

// Concrete Method: A method that has a body and that is defined is called a concrete method. A concrete method in Java is a method that has a complete implementation within a class, as opposed to an abstract method, which is declared without an implementation. Concrete methods provide the actual functionality that can be executed when the method is called.


abstract class Car{  
    
    // If we want to declare a method without defining it we are suppoed to create a method of abstract type. But it is to be kept in mind that abstract method can only be defined in abstract class, so in order for us to have methods that are declared and not defined we need to have abstract classes in order to be able to create abstract methods which we can only declare without defining. 

    public abstract void drive();    // Declaering a method: such kind of a method without definition is called an abstract method. 
    public abstract void fly();

    public void playMusic(){        // Defining a method along with declaring it 
        System.out.println("Play Music");
    }
}

// As the super class has two undefined abstact methods and we aren't defining all those within this class we would need to make this class an abstract class as well other wise the compiler will throw an error.
abstract class WagonR extends Car{          

    public void drive(){
        System.out.println("Driving");
    }

}

// Concrete Class as all the methods within as defined and implemented and it can be instantialized as well 
class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying");
    }
}


public class OOP_9_Abstraction {
    public static void main(String[] args) {

        // We cannot create an object of an Abstract class
        // Car obj = new Car();

        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}
