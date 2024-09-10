// Let's create an Arraylist of String Data Type and Populate it and then try to iterate it using various different ways.

import java.util.*;
import java.util.Iterator;

public class ArrayList02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> fruitList = new ArrayList<>();

        // Adding String Elements to the ArrayList:
        fruitList.add("Cherry");
        fruitList.add("Cucumber");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Mango");

        // Adding User entered string elements to the ArrayList:
        // System.out.println("Enter -1 to stop entry");
        // while (true) {
        // String userInput = sc.nextLine();
        // if (userInput.equalsIgnoreCase("-1")) {
        // break;
        // }
        // fruitList.add(userInput);
        // }

        System.out.print(fruitList);
        System.out.println();


        // Traversing an ArrayList using the iterator interface:
        // In order to create an iterator we need to import the iterator class.
        System.out.println("\nTraversing the ArrayList using an iterator: ");
        Iterator<String> strIt = fruitList.iterator();
        while (strIt.hasNext()) {
            System.out.print(strIt.next() + " ");
        }
        System.out.println();


        // Iterating ArrayList using for-each loop/enhanced for loop:
        System.out.println("\nTraversing the ArrayList using a for-each loop: ");
        for(String fruit: fruitList){
            System.out.print(fruit + " ");
        }
        sc.close();

    }
}
