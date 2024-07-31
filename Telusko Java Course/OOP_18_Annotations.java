// Annotations in Java are a form of metadata that provide data about a program but are not part of the program itself. They are used to provide information to the compiler, to perform runtime processing, or to affect the way the program is executed. Annotations can be applied to classes, methods, fields, parameters, and other elements.

class A{
    public void thisisalongfunction(){
        System.out.println("In Class A");
    }
}

class B extends A{
    
    @Override               // Using this annotation @Override tells the compiler that this method is suppoed to be overridden and if I don't do so the compiler will through me an error saying that I didn't override this function while it was meant to be overridden. 
    public void thisisalongfunction(){
        System.out.println("In Class B");
    }
}


// Built in method level annocations: 
// @SafeWarags
// @SuppressWarnings


public class OOP_18_Annotations {
    public static void main(String[] args) {

        // Dynamic Mehot dispath 
        A obj = new A();
        obj.thisisalongfunction();

        obj = new B();
        obj.thisisalongfunction();


    }
}
