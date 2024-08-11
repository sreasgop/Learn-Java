// What is the Class name of Java Array? Or in other words which class does Java Array belong to:
// In Java, an array is an object of the Object Class. For array object, a proxy class called 'I' is created whose name can be obtained by getClass().getName() method on the object class.

public class Array07_ObjectClass {
    public static void main(String[] args) {
        
        // Creating an Array:
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        // Printing the name of the Proxy class that arrays belong to:
        System.out.println("Name of Proxy class that arrays belong to: "+arr.getClass().getName());

    }
}
