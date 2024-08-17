
public class Array01_ArrayClass {
    public static void main(String[] args) {

        
        // Creating a blank array using the new keyword and default constructor: 
        Array arr1 = new Array();
        arr1.populateArray();                                     // Taking input from the user of n number of elements using .populateArray() method.
        System.out.println("\narr1: " + arr1.toString());                      // Printing the array directly using println statement
        System.out.println("Largest: " + arr1.findLargest());     // Retreiving the largest element using the .findLargest() method


        // Using the parameterized consstructor to create an object of array class by passing an anonymous array directly as the parameter: 
        Array arr2 = new Array(new int[]{-10, 20, 0, -40, -50, -60});
        System.out.println("\narr2: " + arr2);                                // Printing the newly created array directly using the println statement. 
        arr2.reverseArray();                                                // Reversing the array, using the .reverseArrau() method.
        System.out.println("rr2 after reverse: " + arr2);        
        System.out.println("2nd Largest: " + arr2.findSecondLargest());     // Finding the 2nd largest element using the findSecondLargest() method
        

        Array arr3 = new Array();
        System.out.println(arr3);
    }
}
