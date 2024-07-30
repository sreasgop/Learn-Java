
abstract class A{
    public abstract void show();
    public abstract void config();
}

public class OOP_12 {
    public static void main(String[] args) {
        
        // We know that we cannot crete any object of an abstract class but in this case we actually aren't creating an object. 
        // Here we are creating an anonymous inner class of the abstract class and that's why it's legal.
        A obj = new A() {
            public void show(){
                System.out.println("In Abstract Anonymous Inner Class");
            }

            public void config(){
                System.out.println("In config");
            }
        };


        obj.show();
        obj.config();

        // If we print the obj we can see that we obj is of OOPS_12$1 type, which means that it's the first anonymous internal class instance of the class OOPS_12.
        System.out.println("Type of Object: "+obj);

    }
}
