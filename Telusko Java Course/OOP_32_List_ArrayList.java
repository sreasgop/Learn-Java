// The List interface in Java is a part of the Java Collections Framework and is found in the java.util package. It represents an ordered collection (also known as a sequence) of elements.

// Implementation of List: The List Interface is implemented by the following class, and we know that we cannot create an object of an interface directly hence we are required to create an object of a class that implements an interface. These are the two classes that implements the List Interface: 
// ArrayList: Provides a resizable array. It offers constant-time access to elements but may be slower for insertion and deletion, especially in the middle of the list.
// LinkedList: Implements a doubly-linked list. It is faster for insertions and deletions but slower for random access compared to ArrayList.


import java.util.ArrayList;
import java.util.List;

public class OOP_32_List_ArrayList {
    public static void main(String[] args) {
        
        // Creating a ArrayList Object assigned to the Reference Variable of type List.
        List<Integer> listobj = new ArrayList<Integer>();

        listobj.add(10);
        listobj.add(20);
        listobj.add(30);
        listobj.add(40);
        listobj.add(50);

        System.out.println(listobj);

        // Printing the ArrayList using an enhanced for loop
        System.out.print("Printing an Object of ArrayList assigned to a reference type of List:");
        for(Object n: listobj){
            int num = (Integer)n; 
            System.out.print(num+" ");
        }
        System.out.println();

        // In List reference types we can access the elements using their index values using the .get method. 
        System.out.println("Element at 3rd Index: " + listobj.get(3));
        
        // We can get the first element in a list and last element in a list using .getFirst() and .getLast() respectively.
        System.out.println("First element in array: " + listobj.getFirst());
        System.out.println("Last element in array: " + listobj.getLast());
        
        // We can figure out the index of a given valueu using the .indexOf() method in a list reference type. 
        System.out.println("Index of 30: "+listobj.indexOf(30));
        
        // If we try to use .indexOf() for any value that doesn't exist in a list we will get -1
        System.out.println("Index of 300: "+listobj.indexOf(300));

        // We can wipe out and delete all the elements of a List Reference Type ArrayList object using the .clear() method. 
        listobj.clear();
        System.out.println("List Reference type of ArrayList Object: " + listobj);

        // the isEmpty() method returns true if the list contains no elements. 
        System.out.println("Is the List Empty: "+listobj.isEmpty());

        // Repopulating the ArrayList Object with values
        listobj.add(10);
        listobj.add(100);
        listobj.add(30);
        listobj.add(40);
        listobj.add(50);

        // the .contains() method helps us know if the speficied object is there in the ArrayList Object assigned to the Reference Variable of type List.
        System.out.println("Contains 10: " + listobj.contains(10));

        // the .reversed() method helps us reverse the ArrayList object assigned to the Reference Variable of type List. 
        List<Integer> newListObj = listobj.reversed();
        System.out.println("Reversed List: " + newListObj);

        // Using the .addfirst() method we can directly add at beginning of the list. 
        listobj.addFirst(99);
        System.out.println(listobj);

        // Using the .addLast() method we can directly add the the last of the list.
        listobj.addLast(90);
        System.out.println(listobj);

    }
}
