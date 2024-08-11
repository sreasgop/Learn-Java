// Write a program to create an array of random elements: 

import java.util.Scanner;

public class Array02_RandomElements {
    public static void main(String[] args) {
        
        // Creating an Object of Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        sc.close();

        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = ((int)(Math.random()*101));
        }    

        System.out.println("Array of random numbers: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
