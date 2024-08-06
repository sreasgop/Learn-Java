// METHOD OVERRIDING 
// Method overriding is a feature in object-oriented programming that allows a subclass (or child class) to provide a specific implementation of a method that is already defined in its superclass (or parent class). This is particularly useful for runtime polymorphism, where the method that gets executed is determined by the object that calls it.

// If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed. In other words, it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.


class A{
    public void show(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B Show");
    }
}

class C extends B{
    public void show(){
        System.out.println("In C Show");
    }
}



public class OOP_07_MethodOverriding {
    public static void main(String[] args) {
        
        B obj = new B();
        obj.show();


        // Dynamic Method Dispatch 

        A obj2 = new A();   
        obj2.show();        // Run-Time Polymorphism 

        obj2 = new B();     // Reference of A and Object of B
        obj2.show();

        obj2 = new C();     // Reference of A and Object of C
        obj2.show();
    }
}
