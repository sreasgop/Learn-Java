// Anonymous Inner Class: When we define the new properties of a class during instantiating it we end up having an anonymous inner class. As such kind of a class is anonymous when compiled we get the name of the class where we are initializing the object with the new definition. For instances if I instantialize an object of class A within the OOP_11_AnonymousInnerClass with some new properties, when compiled we will get the following name for the anonymous inner class OOP_11_AnonymousInnerClass$1.class

// Why do we need Anonymous Inner Classes?
// For instance, if we want to override the show method with something else for a particular object to do it we would need to create a new class that would inherit the A class and then we can implement a method overriding and in that way we can have a different show method for a use case. But that is inefficient if we would only need to do that for an object and for once method only. For such cases the anonymous inner class functionality provided by java comes in handy and gets the job done efficiently. 

class A{
    public void show(){
        System.out.println("In A show");
    }
}


public class OOP_11_AnonymousInnerClass{
    public static void main(String[] args) {
        
        // This is the syntax to define an anonymous inner class.
        A obj = new A(){
            public void show(){
                System.out.println("In Anonymous Inner Class of A Class");
            }
        };

        obj.show();

    }
}