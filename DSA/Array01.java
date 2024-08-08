// An array is a collection of elements of same data type stored in contigious memory. We can only store a fixed set of elements in a Java Array. 
// Array in Java is index-based, and indexing starts at 0 and goes till length-1.
// In Java we can get the length of an array using the .length member. 
// Java supports anonymoyus array as wel.

// What is an Anonymous Array?
// In Java, an "anonymous array" refers to an array that is created without being assigned to a variable. Instead, it is passed directly to a method or used immediately after its creation. This technique is useful when you need to quickly create and use an array without the need to reuse it later

// An example has been used to demonstrate the use of Anonymous Array: Line No. 72.

public class Array01{

    static void max(int arr[]){
        int max_val = arr[0];
        for(int i: arr){
            if(i>max_val){
                max_val = i;
            }
        }
        System.out.println("Maximum Value: "+max_val);
    }

    public static void main(String[] args) {

        // CREATING AN ARRAY: 
        // Declaring an array of Integers named 'arr':
        int[] arr;

        // Instantiating na array of 10 elements:
        arr = new int[10];

        // Initializing the Array using index values:
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;
        arr[7] = 80;
        arr[8] = 90;
        arr[9] = 100;

        // Printing the values of the array using normal for loop: 
        System.out.println("Printing array using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Printing the values of the array using enhanced for loop/for each loop:
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();


        // CREATING ANOTHER ARRAY: 
        // Declarition, Instantiation and Initialization of Array:
        int[] newarr = {2, 4, 6, 8, 10};
        
        // Printing the array using enhanced for loop:
        for (int i : newarr) {
            System.out.print(i+" ");
        }
        System.out.println();


        // Using Anonymous Array to call the Array01.max() method: 
        // An anonymous array is nothing but an array that isn't assigned to a variable name. 
        // NOTE: We can't pass the same array to multiple methods or functions as we don't have a variable name attached to it. 
        Array01.max(new int[]{20, 10, 300, 99, -12, 90});

    }
}