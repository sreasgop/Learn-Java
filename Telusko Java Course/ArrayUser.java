import java.util.Scanner;

public class ArrayUser {
    public static void main(String[] args) {

        // Creating an object of Scanner class by the name sc.
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.print("Enter " + n + " numbers: ");

        // Taking User Input to populate array
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        sc.close();

        // Printing User Entered Array
        System.out.print("Array: ");

        for (int i : num) {
            System.out.print(i+" ");
        }
        System.out.println();


    }    
}
