// We know that in java for each class a compiler file by the .class extension is created but as B is an inner class that belongs to the class A, we will get a separate kind of object file for this inner class. One with the name A$B.class where the $ sign inclues that that B inner class belongs to the A outer class. 

class AClass{

    int data;

    public void show(){
        System.out.println("In A show");
    }

    // Non-Static Inner Class
    class BClass{

        public void config(){
            System.out.println("In B Config");
        }
    }

    // Static Inner Class
    static class CClass{
        public void config(){
            System.out.println("In C Config");
        }
    }

}

public class OOP_10_InnerClass {
    public static void main(String[] args) {
        
        AClass obj = new AClass(); 
        obj.show();

        // For a non static inner class this is how we are suppoed to make an object of it. 
        AClass.BClass obj1 = obj.new BClass();     // As B is not a static class we need an object of Class A to be able to declare it.
        obj1.config();

        // For a static inner class this is how we are suppoed to make an object of it. 
        AClass.CClass obj2 = new AClass.CClass();       // As C is a static class we can directly use the . operator after the A class and declare it.
        obj2.config();
    }
}
