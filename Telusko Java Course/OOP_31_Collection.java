// The Collection interface in Java is a fundamental part of the Java Collections Framework and is found in the java.util package. Collection is the root interface for the Java Collections Framework (excluding maps). It defines the most common methods used to manipulate a collection of objects.

// Several sub-interfaces extend Collection, including List, Set, and Queue, each adding specific behaviors:
// List: An ordered collection that allows duplicates. List is further implemented by two classes: ArrayList and LinkedList.
// Set: A collection that does not allow duplicates. Set is further implemented by two classes: HashSet and LinkedHashSet.
// Queue: A collection designed for holding elements prior to processing, typically in FIFO (first-in, first-out) order. Queue is further implemented by Dequeue. 


import java.util.ArrayList;
import java.util.Collection;        // In order to be able to use the collection framework we need to import it as it is in java.util package. 


public class OOP_31_Collection {
    public static void main(String[] args){
        
        Collection<Integer> arr = new ArrayList<Integer>();    // Adding the data type makes the code much more better as during adding value if we end up adding anything of the other type  we get compile time error. 
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);

        // Creating another Array list of Integers
        ArrayList<Integer> newarr = new ArrayList<Integer>() ;
        newarr.add(10);
        newarr.add(20);
        newarr.add(30);

        // Directly printing the Arraylist 
        System.out.println("First Array: " + arr);
        System.out.println("Second Array: "+ newarr);

        // Concatenating Two arrays: 
        arr.addAll(newarr);
        System.out.println("Concatenated Array: " +  arr);


        // Accesing the ArrayList using an enhanced for loop
        System.out.print("Printing ArrayList using enhanced for loop: ");
        for(int num: arr){
            System.out.print(num + " ");
        }

    }
}
