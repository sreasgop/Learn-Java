@FunctionalInterface        // A functional interace is an interface with only one abstract method. 
interface A{
    void show();        // If we add anymore abstract method we will get a run-time error.
}

class B implements A{
    public void show(){
        System.out.println("In show.");
    }
}

public class OOP_19_FunctionalInterface {
    public static void main(String[] args) {
        
        // By creating an object of Class B with a Reference type of interface A
        A obj = new B();
        obj.show();

        // By creating an anonymous inner class of reference type of interface A..
        A obj2 = new A() {
            public void show(){
                System.out.println("In New Show");
            }
        };

        obj2.show();
    }
}
