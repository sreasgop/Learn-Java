// A Set in Java is a collection that does not allow duplicate elements. It models the mathematical set abstraction and is part of the Java Collections Framework. The Set interface is implemented by various classes such as HashSet, LinkedHashSet, and TreeSet, each having its own characteristics.

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class OOP_34_Set_HashSet{
    public static void main(String[] args) {
        
        // Set doesn't allow duplicate elements to be there in the array.
        // Another important thing to be kept in mind is that data isn't stored in serial in Set.
        // Set doesn't support index values. 
        Set<Integer> setObj = new HashSet<Integer>();

        setObj.add(10);
        setObj.add(20);
        setObj.add(30);
        setObj.add(40);
        setObj.add(10);
        setObj.add(10);

        System.out.println(setObj);


        
        // All the elements in the TreeSet() is sorted by default. 
        Set<Integer> setObj2 = new TreeSet<Integer>();

        setObj2.add(100);
        setObj2.add(0);
        setObj2.add(10);
        setObj2.add(2);
        setObj2.add(12);
        setObj2.add(-2);
        setObj2.add(-20);

        System.out.println(setObj2);

    

        // Using an Iterator of Integer type to access the values of the Set Object. 
        Iterator<Integer> iteratorObj = setObj.iterator();

        while(iteratorObj.hasNext()){
            System.out.print(iteratorObj.next()+" ");
        }

    }
}