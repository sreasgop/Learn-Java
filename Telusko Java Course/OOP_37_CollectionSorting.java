// Java collection class is used exclusively with static methods that operate on or return collections. It inherits Object class.

// The important points about Java Collections class are:
// Java Collection class supports the polymorphic algorithms that operate on collections.
// Java Collection class throws a NullPointerException if the collections or class objects provided to them are null.


import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class OOP_37_CollectionSorting {
    public static void main(String[] args) {
        
        List<Integer> listobj = new ArrayList<>();

        listobj.add(10);
        listobj.add(-2);
        listobj.add(20);
        listobj.add(99);
        listobj.add(0);
        listobj.add(4);
        listobj.add(2);
        listobj.add(22);
        listobj.add(5);

        // We have used Collection interface and we know that a lot of other data structures of the Collection framework implements it like the List, Set, Queue. It is the root interface of the Java Collections Framework.

        // There exists something called Collections as well. Collections is a utility class that provides static methods for common operations on collection type data types, like sorting and searching, making it easier to manipulate collections without writing boilerplate code.
        
        // The .sort() static method of the Collections Class helps us sort any collection type, i.e. List, Set, Queue, etc. 
        Collections.sort(listobj);
        System.out.println("Sorted Array: "+listobj);

    }
}
