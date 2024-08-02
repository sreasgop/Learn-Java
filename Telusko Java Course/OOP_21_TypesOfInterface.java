// Types of Interfaces
// 1. Normal Interface: An interface that has two or more methods are called normal interface. 
// 2. Functionl Interface/SAM: An interface with only one method is called a functional interface, this type of interface is also called Single Abstract Method     
// 3. Marker Interface: An interface with no methods, a blank interface is called a marker interface. It is done to update somethng to the compoiler. 

// Serialiizatioin: Take the object and store thhe values in the hard drive. 

interface SimpleCalc{
    int add(int i, int j);  
    int sub(int i, int j);
}

@FunctionalInterface
interface A{
    void show();
}

public class OOP_21_TypesOfInterface {
    public static void main(String[] args) {
    

        
    }
}
