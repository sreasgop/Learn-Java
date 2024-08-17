import java.util.Scanner;
import java.util.Random;

/**
 * The Array class provides a comprehensive set of utilities for managing and manipulating arrays.
 * This class allows users to create blank array objects and populate them either programmatically
 * using the static method {@code populateArray(int numberOfElements)} or interactively through user input
 * with the {@code populateArray()} method. Additionally, the Array class offers methods to reverse the 
 * contents of an array, print the array using the {@code Sysstem.out.println} statement, and find the largest and 
 * second largest elements within the array. These features make the Array class a versatile tool for 
 * handling common array operations efficiently and intuitively.
 * @author Chandra Sreas Gop
 * @since 22.0
 */
public class Array{


    private static Random rand = new Random();
    private static Scanner sc = new Scanner(System.in);
    private int[] arr;

    /**
     * Default Constructor of the {@code Array} class, it helps to create an instance of Array class. 
     */
    public Array(){}

    /**
     * The parameterized constructor of {@code Array} class takes an anonymous array as a parameter and creates an instance of {@code Array} class using the same elements as passed in the anonymous array.
     * @param arr (Takes an anonymous array {@code arr} as the parameter)
     */
    public Array(int arr[]){
        this.arr = arr;
    }

    /**
     * Takes the {@code numOfElements} as the parameter, and based on that creates a random array of integer of specifiec number of elements. 
     * @param numOfElements (Takes the an {@code int} as a paramter which determines how many element is suppoed to be added to the {@code int[]} instance)
     */
    public void createRandArray(int numOfElements){
        arr = new int[numOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
    }

    /**
     * Based on the entered parameter {@code numOfElements}, the {@code populateArray()} method prompts the user to enter the mentioned number of elements and store them to the instance of the {@code Array} class.
     * @param numOfElements (Takes the an {@code int} as a paramter which determines how many element is suppoed to be added to the {@code Array} instance)
     */
    public void populateArray(int numOfElements){
        System.out.print("Enter " + numOfElements + " integers: ");
        arr = new int[numOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    /** 
     * 
     * Asks the user for the number of elements to be entered to the array, and then takes input from the user for each element and stores in into the array. 
     */
    public void populateArray(){
        
        System.out.print("\nNumber of element: ");
        int numOfElements = sc.nextInt();

        System.out.print("Enter " + numOfElements + " integers: ");
        arr = new int[numOfElements];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    /**
     * Traverses the entire array looking for the largest element.
     * @return the largest {@code int} in the array and {@code null} if the array is empty; 
     */
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

    /**
     * Traverses the entire array while comparing against the largest {@code int}, looking for the second largest {@code int}
     * @return The 2nd largest {@code int} in the array.
     */
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

    /**
     * Reverses the current instance of the {@code Array} class.
     */
    public void reverseArray(){
        for (int i = 0, j = arr.length - 1; i < arr.length/2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * The {@code .toString()} method is implicitly called whenever an object of {@code Array class} is attempted to be printed directly. StringBuffer have been used along with a fori loop to traverse through each element of the array and {@code .append()} method of the {@code StringBuffer class} has been used to create the final {@code String Object} which is returned in the end.
     * @return The Array in String format.
     * @throws NullPointerException Whenever a empty string is attempted to be printed.
     */
    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            for (int i : this.arr) {
                stringBuffer.append(i+" ");
            }    
            return stringBuffer.toString();
        } catch (NullPointerException e) {
            stringBuffer.append("Cannot print Empty Array! ");
            return stringBuffer.toString();
        }
        
    }
    
}