// Map is an interface in the Java Collections Framework that defines a data structure for mapping keys to values. It specifies methods for adding, removing, and querying key-value pairs. We cannot instantiate an interface directly. Instead, you create an object from a class that implements the Map interface.

// While Map itself is an interface and cannot be instantiated, you can create objects of classes that implement the Map interface, such as HashMap, LinkedHashMap, and TreeMap. These objects are instances of those classes and can be used to store and manage key-value pairs in Java.

// Several classes implement the Map interface, and objects of these classes can be instantiated and used as maps. Here are some common implementations:

// HashMap
// Class: java.util.HashMap
// Description: Implements the Map interface using a hash table.
// Usage: Map<String, Integer> map = new HashMap<>();

// Hashtable
// Class: java.util.HashTable
// Description: Hashtable is a synchronized implementation of the Map interface that does not allow null keys or values. While it is thread-safe and can be used in concurrent environments, it is generally recommended to use ConcurrentHashMap for better scalability and performance in multi-threaded scenarios. For non-threaded environments, HashMap is preferred due to its flexibility and better performance.
// Usage: Hashtable<String, Integer> hashtable = new Hashtable<>();

// LinkedHashMap
// Class: java.util.LinkedHashMap
// Description: Extends HashMap with a linked list running through all entries.
// Usage: Map<String, Integer> map = new LinkedHashMap<>();

// TreeMap
// Class: java.util.TreeMap
// Description: Implements the NavigableMap interface using a red-black tree.
// Usage: Map<String, Integer> map = new TreeMap<>();



// All the important methods of HashMaps and Hashtables:
// put(K key, V value): Associates the specified value with the specified key in this hashtable.
// get(Object key): Returns the value to which the specified key is mapped.
// remove(Object key): Removes the key (and its corresponding value) from this hashtable.
// containsKey(Object key): Tests if the specified object is a key in this hashtable.
// containsValue(Object value): Tests if some key maps into the specified value in this hashtable.
// size(): Returns the number of key-value mappings in this hashtable.
// isEmpty(): Tests if this hashtable maps no keys to values.


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Hashtable;

public class OOP_35_Map{
    public static void main(String[] args){

        // HASHMAP
        // In place of HashMaps we can also work with Hashtable if we are working with muultiple threads and want synchronized methods for multiple threads accesing immutable values.
        Map<String, Integer> map = new HashMap<>();

        map.put("Chandra Sreas Gop", 100);
        map.put("Soutrika Das", 98);
        map.put("Sanjib Kumar Sah", 60);
        map.put("Ayush Kumar Sah", 80);

        System.out.println(map);

        // .get() method takes the key as a parameter and prints the value as an output
        System.out.println("Marks of Chandra Sreas Gop: " + map.get("Chandra Sreas Gop"));
        
        // .keyset() method prints all the available keys in the map.
        System.out.println("\n\n"+map.keySet());

        // .values() method prints all the available values int the map.
        System.out.println("\n\n"+map.values());


        // We can use the .entrySet() method to access the keys and values using an enhanced for loop.
        System.out.println("\n\nAccessing values using .entrySet() and enhanced for loop:");
        for(Entry<String, Integer> marks: map.entrySet()){
            System.out.println(marks);
        }

        // We can use the .keyset() method to access all the keys using an enhanced for loop.
        System.out.println("\n\nAccessing values using .keySet() and enhanced for loop:");
        for(String name: map.keySet()){
            System.out.println(name + " : " + map.get(name));
        }


        // HASHTABLE
        // Creaing an object of Hashtable type with a variable of reference type Map.
        Map<Integer, String> hashtable = new Hashtable<>();

        // Using the .put() method to populate the Hashtable.
        hashtable.put(2451, "Sreas Gop");
        hashtable.put(2454, "Soutrika Das");
        hashtable.put(2492, "Sanjib Kumar Sah");
        hashtable.put(2449, "Ayush Kumar Shaw");

        
        System.out.println("\n\nPrinting the Hashtable as it is:");
        System.out.println(hashtable);

        //Using the .get() method
        System.out.println("\nName of student with Roll 2451: "+hashtable.get(2451));

        // Using the .remove() method
        System.out.println("\nRemoved Student: "+hashtable.remove(2449));

        // Using the .containskey() method
        System.out.println("\nContains 2451: "+hashtable.containsKey(2451));

        // Using the .containisvalue() method
        System.out.println("\nContains Soutrika Das: "+hashtable.containsValue("Soutrika Das"));

        // Using the .size() method
        System.out.println("\nSize of Hashtable: "+hashtable.size());

        // Using the .clear() method
        hashtable.clear();

        // Using the .isEmpty() method
        System.out.println("\nIs Empty: "+hashtable.isEmpty());
    }   
}