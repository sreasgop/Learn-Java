import java.util.Scanner;
import java.util.Random;

public class Array10_InsertElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] arr = new int[100];

        int arrSize = 7;

        for (int i = 0; i < arrSize; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.print("\nEnter value to enter: ");
        int data = sc.nextInt();

        System.out.print("Insert at Index: ");
        int pos = sc.nextInt();

        arrSize = InsertElement(arr, arrSize, data, pos);

        System.out.println("\nArray after insertion: ");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();

    }

    static int InsertElement(int[] arr, int size, int value, int index) {

        if (index >= arr.length) {
            System.out.println("Array Full. Can't Insert new elements!");
            return size;
        } else if (index >= size) {
            System.out.println("There isn't enough elements in Array to insert at the following index!");
            return size;
        }

        for (int i = arr.length - 1; i < index; i++) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;

        return size++;

    }
}
