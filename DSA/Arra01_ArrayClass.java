import java.util.Scanner;
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
        
        System.out.print("Number of element: ");
        int numOfElements = sc.nextInt();

        System.out.print("Enter " + numOfElements + " integers: ");
        arr = new int[numOfElements];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public int findLargest(){
        if(arr==null){
            System.out.println("Array is empty! Cannot find largest.");
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i>largest)
                largest = i;
        }
        System.out.println(largest);
        return largest;
    }

    public void printArray(){
        for (int i : this.arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}

public class Arra01_ArrayClass {
    public static void main(String[] args) {

        Array arr1 = new Array();
        arr1.populateArray();

        System.out.print("Array1: ");
        arr1.printArray();
        
        System.out.print("Largest: ");
        arr1.findLargest();

        // Using the parameterized consstructor to create an array: 
        Array arr2 = new Array(new int[]{10, 20, 30, 40, 50});
        
        System.out.print("Array2: ");
        arr2.printArray();

        System.out.print("Largest: ");
        arr2.findLargest();

    }
}
