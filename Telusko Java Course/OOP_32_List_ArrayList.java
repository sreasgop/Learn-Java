import java.util.ArrayList;
import java.util.List;

public class OOP_32_List_ArrayList {
    public static void main(String[] args) {
        
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
