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
        
        A obj = new B();
        obj.show();

    }
}
