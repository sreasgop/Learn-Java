// Final --> Variable, method, class

// final variable: Using final keyword along with a variable makes that variable a constant. In other words the variable turns out to be an immutable one.
// final method: Using final keyword along with a method lets us stop method overridding. 
// final class: Using the final keyword along the name of a class makes that class of a type that cannot be extended, in other words final keyword helps us create a class that cannot be inherited from. (We stop the inheritance by making a class final)


// Class A can no longer be extended to any other class because it's a final class. Trying to extend this class will raise an error.
final class A{          // Inheritance for this class has been stoped due to the final keyword. No other class can inherit from this class. 
    public void show(){
        System.out.println("In A show");
    }
}

// This method cannot be overridden. In other words a subclass of this super class cannot have a method with the same signature.
class B{
    public final void show(){       // Trying to override this method will raise an error.
        System.out.println("In B Show");
    }
}

class C extends B{
    // Trying to override the show() method in this subclass will raise an error as the show() method has been defined as a final method in the superclass.
    public void Newshow(){
        System.out.println("In C Show with different method signature from that of it's super class.");
    }
}

public class Final {
    public static void main(String[] args) {

        // This is an immutable variable now, i.e. none can change the value of it
        final double PIE = 3.14159d;        // Trying to reassign the value of this constant will raise an error.
        System.out.println(PIE);


        C obj = new C();
        obj.Newshow();
    }
}
