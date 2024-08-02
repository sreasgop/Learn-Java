// throws: The throws keyword helps us to avoid using try/catch block to handle an exception and the responsibility of handling the exception lies with the calling class and not the class that is being called. 
// Disclaimer: It's a bad idea to use throws along with the main method because if we do that, it simply translate to the fact that main will not handle the exception and it is deligating it to the JVM and to which the JVM will by default raise an error even if nothing went wrong

// Example: Class.forName() is a method that lets us dynamically load a class at runtime. Which means that there's a possibility that the class we are trying to load doesn't exist as a result it can throw an exception. As a result whenever we are using that method we are reqyired to handle the exception. Now, if we are trying to load a class that exists we won't be getting an error if we use the try and catch blocks in the main method, but if we use throws keyword we will definitely get an error in spite of that class being present in the package. 

class A{
    public void show(){

        // We will try to load a class using the Class.forName() method which requires explicit exception handling. 
        try{
            Class.forName("Calc");
        } catch(ClassNotFoundException CNFE){
            System.out.println("Class that you are trying to load isn't found!");
        }
    }
}


class B{
    // We are not taking care of the exception handling here and rather we are Ducking exception using the throws keyword. 
    // Which means that we would need to take care
    public void show(String className) throws ClassNotFoundException{
        Class.forName(className);
    }
}


public class OOP_24_Dunking {
    public static void main(String[] args){ 
        
        // In main we should always handle whatever exception we are suppoed to have, other wise if we deligate from main using throws keyword we are supposed to get that specific Exception raised by the JVM even if nothing went wrong. 
        // try {
        //     Class.forName("Mobile");
        // } catch (ClassNotFoundException e) {
        //     System.out.println("Class not Found!");;
        // }

        
        // As we have taken care of the explicit exception handling that is required while calling the Class.forName() method in the class A itself we can simply call it here in the main method without worrying much.
        // A obj = new A();
        // obj.show();

        
        // We would need to take care of it ourselves directly 
        B obj = new B();
        try{
            obj.show("A");
            System.out.println("Class Loaded");
        } catch(ClassNotFoundException e){
            System.out.println("Class not found!");
        }

    }
}
