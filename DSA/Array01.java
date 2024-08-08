// An array is a collection of elements of same data type stored in contigious memory. We can only store a fixed set of elements in a Java Array. 
// Array in Java is 

public class Array01{
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

    }
}