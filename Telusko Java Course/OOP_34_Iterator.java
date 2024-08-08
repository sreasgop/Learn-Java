// An iterator in Java is an interface that allows you to traverse through a collection, such as a list or a set, one element at a time. It provides a way to access elements of a collection sequentially without exposing the underlying structure. The Java Iterator is also known as the universal cursor of Java as it is appropriate for all the classes of the Collection framework. In Java Iterator, we can use both of the read and remove operations. 

// Why do we need Iterators over enhanced for loops?
// If a user is working with a for loop, they cannot modernize(add/remove) the Collection, whereas, if they use the Java Iterator, they can simply update the Collection.

// Disadvantages of Iterator: 
// The Java Iterator only preserves the iteration in the forward direction. In simple words, the Java Iterator is a uni-directional Iterator.
// The Java Iterator doesn't allow the replacement of an existing element in the collection with a new one directly and iterators doesn't allow adding new elements to the collction while iterating through it.
// Unlike the Spliterator Interface, Interator doesn't support traversing elements in parallel pattern which implies that Java Iterator only supports Sequential Iteration.
// In CRUD Operations, the Java Iterator does not hold true for CREATE and UPDATE.

// Methods of Iterator Interface: 
// .hasNext() : The method does not accept any parameter. It returns true if there are more elements left in the iteration. If there are no more elements left, then it will return false. If there are no more elements left in the iteration, then there is no need to call the next() method. In simple words, we can say that the method is used to determine whether the next() method is to be called or not.
// .next(): It is similar to hasNext() method. It also does not accept any parameter. It returns E, i.e., the next element in the traversal. If the iteration or collection of objects has no more elements left to iterate, then it throws the NoSuchElementException.
// .remove(): This method also does not require any parameters. There is no return type of this method. The main function of this method is to remove the last element returned by the iterator traversing through the underlying collection. The remove () method can be requested hardly once per the next () method call. If the iterator does not support the remove operation, then it throws the UnSupportedOperationException. It also throws the IllegalStateException if the next method is not yet called.
// .forEachRemaining(Consumer action): It is the only method of Java Iterator that takes a parameter. It accepts action as a parameter. Action is nothing but that is to be performed. There is no return type of the method. This method performs the particularized operation on all of the left components of the collection until all the components are consumed or the action throws an exception. Exceptions thrown by action are delivered to the caller. If the action is null, then it throws a NullPointerException.


import java.util.ArrayList;
import java.util.Iterator;

public class OOP_34_Iterator {
    public static void main(String[] args) {
        
        // Creating a Variable of ArrayList type and initializing an ArrayList to it. 
        ArrayList<Integer> arr = new ArrayList<>();

        // Populating the ArrayList with values:
        arr.add(10);
        arr.add(2);
        arr.add(24);
        arr.add(5);
        arr.add(7);
        arr.add(15);

        // Creating an iterator reference of Integer type for the arr variable:
        Iterator<Integer> it = arr.iterator();

        // The .hasnext() method of the Iterator Interface returns true if the iterator object has a next value. 
        while(it.hasNext()){
            System.out.print(it.next()+" ");    // The .next() method of the Iterator Interface returns the value of the present element and moves the iterator object to next element. 
        }
        System.out.println();


        // Creating another iterator reference of Integer type for the arr variable: 
        Iterator<Integer> newit = arr.iterator();
        
        // this method removes the last element returned by the iterator traversing through the underlying collection. The .remove() method can be requested hardly once per the next () method call. If the iterator does not support the remove operation, then it throws the UnSupportedOperationException. It also throws the IllegalStateException if the .next() method is not yet called.
        newit.next();      // In order to be able to call .remove() we first need to call .next()
        newit.remove();

        System.out.println(newit.next());
    }
}
