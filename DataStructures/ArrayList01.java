// ArrayList

// Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.

// Important features of ArrayList:
// Java ArrayList class can contain duplicate elements.
// Java ArrayList class maintains insertion order.
// Java ArrayList class is non synchronized.
// Java ArrayList allows random access because the array works on an index basis.
// In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
// We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. For example:

// Hierarchy of ArrayList class: The Java ArrayList class extends AbstractList class which implements the List interface. The List interface extends the Collection and Iterable interfaces in hierarchical order.  (ArrayList ----> AbstractList ----> List ----> Collection ----> Iterable)

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList01 {
    public static void main(String[] args) {

        // NON-GENERIC Vs GENERIC Collection:
        // Creating a non-generic collection: Using non-generic collections enabled us
        // to be able to have data of multiple data types within the same collectio
        // Java collection framework was non-generic before JDK 1.5.
        // ArrayList listObj1 = new ArrayList<>();

        // listObj1.add(10);
        // listObj1.add(20);
        // listObj1.add("Sreas");
        // listObj1.add(3.1415f);
        // listObj1.add(true);

        // System.out.println(listObj1);
        // System.out.println(listObj1.get(2));

        // Creating a generic collection:
        // Java new generic collection allows you to have only one type of objects in a
        // collection. Now it is type-safe, so typecasting is not required at runtime.
        // In a generic collection, we specify the type in angular braces. Now ArrayList
        // is forced to have the only specified type of object in it. If you try to add
        // another type of object, it gives a compile-time error.
        // We cannot create an ArrayList of primitive data types, such as int, float,
        // char, etc. It is required to use the respective Wrapper class in case of
        // creating any sort of collection and the same follows for ArrayList as well.
        ArrayList<Integer> listObj = new ArrayList<>();

        listObj.add(10);
        listObj.add(20);
        listObj.add(30);
        listObj.add(40);
        listObj.add(50);

        System.out.println(listObj);

        // Constructors of ArrayList class:
        // ArrayList() --> It is used to build an empty array list.
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1);

        // ArrayList(Collection<? extends E>)c) --> It is used to build an array list
        // which is initialized with elements from the mentioned collection.
        ArrayList<Integer> list2 = new ArrayList<>(listObj);
        System.out.println(list2);

        // ArrayList(int capacity) --> It is used to build an array list that has the
        // specified initial capacity.
        ArrayList<Integer> list3 = new ArrayList<>(100);
        System.out.println(list3.size());

        // ArrayList
        // TRAVERSAL IN ORDER Vs TRAVERSAL IN REVERSE
        // Traversing an object of ArrayList using an iterator.
        // Iterator<Integer> it = listObj.iterator();
        // while(it.hasNext()){
        // System.out.print(it.next()+" ");
        // }
        // System.out.println();
        //
        //
        //
        // // Traversing an object of ArrayList in reverse using a ListIterator
        // ListIterator<Integer> it2 = listObj.listIterator(listObj.size());
        // while (it2.hasPrevious()) {
        // System.out.print(it2.previous()+" ");
        // }

    }
}
