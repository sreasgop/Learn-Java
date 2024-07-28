// Inheritance: In order to make a class inhert properties of another class we mention the name of the parent class after the extends keyword.

// Object class: In java by default any class is a child class of the Object class, give that the class doesn't have a parent class. 
// If a class has a parent class, e.g. B. it cannot be a child class of the Object class. In the case of B, it is a child class of the A class which inturn is a child class of the Object class so B is a grandchild of the Object class. 

// super() method: Every constructor in java has a method even if we don't mention it explicitly, which is called the super() method and the job of the super method is to call the constructor of the parent class of a particular class. Therefore if a class doesn't have any explicit parent class, the super method of that class's constructor calls the default constructor of the Object class. 

// this() method: this() method calls the default constructor of the present class. For instance if a class has got multiple constructor, using the this() method within any of the other parameterized constructor will enable the programmer to also call the default constructor along with the other constructor. 

class A extends Object{
    public A(){
        System.out.println("Inside A Constructor.");
    }

    public A(int n){
        System.out.println("Inside Parameterized A Constructor.");
    }
}



class B extends A{
    
    public B(){
        // super() method is present in every constructor in java even if we don't mention it. 
        super();       // The super() method calls the constructor of the parent class, in this case it is calling the constructor of class A. 
        System.out.println("Inside B Constructor");
    }

    public B(int n){
        // super(n);       // Passing an integer to the super constructor in this case will call the parameterized constructor of the class A. 
        this();          // this() method calls the default constructor of the present class, here it is going to call the default constructor of class B.
        System.out.println("Inside Parameterized B Constructor.");
    }

}

public class OOP_6_Inheritence {
    public static void main(String[] args) {
        
        B obj = new B(5);
        System.out.println(obj);
    }
}
