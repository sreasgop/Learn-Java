import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Array{
    private static Random rand = new Random();
    private static Scanner sc = new Scanner(System.in);
    private int[] arr;

    public Array(){}

    public Array(int arr[]){
        this.arr = arr;
    }

    public void createRandArray(int numOfElements){
        arr = new int[numOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
    }

    public void populateArray(int numOfElements){
        System.out.print("Enter " + numOfElements + " integers: ");
        arr = new int[numOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void populateArray(){
        
        System.out.print("\nNumber of element: ");
        int numOfElements = sc.nextInt();

        System.out.print("Enter " + numOfElements + " integers: ");
        arr = new int[numOfElements];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public int findLargest(){
        if(arr==null){
            System.out.println("\nArray is empty! Cannot find largest.");
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i>largest)
                largest = i;
        }
        return largest;
    }

    public int findSecondLargest(){
        int largest = this.findLargest();
        int secondLargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i>secondLargest & i!=largest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    public void reverseArray(){
        int j = arr.length - 1;
        for (int i = 0; i < arr.length/2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public void printArray(){
        for (int i : this.arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return Arrays.toString(arr)+"\n";
    }    
    
}

public class Array01_ArrayClass {
    public static void main(String[] args) {

        
        // Creating a blank array using the new keyword and default constructor: 
        Array arr1 = new Array();
        arr1.populateArray();   // Taking input from the user of n number of elements using .populateArray() method.
        
        System.out.println("arr1: " + arr1);    // Printing the array directly using println statement
        
        System.out.print("Largest: " + arr1.findLargest());     // Retreiving the largest element using the .findLargest() method



        // Using the parameterized consstructor to create an object of array class by passing an anonymous array directly as the parameter: 
        Array arr2 = new Array(new int[]{-10, 20, 0, -40, -50, -60});
        
        System.out.print("arr2: " + arr2);  // Printing the newly created array directly using the println statement. 

        System.out.println("2nd Largest: " + arr2.findSecondLargest());     // Finding the 2nd largest element using the findSecondLargest() method

        arr2.reverseArray();    // Reversing the array, using the .reverseArrau() method.
        System.out.println("arr2 after reverse: " + arr2);        

    }
}
