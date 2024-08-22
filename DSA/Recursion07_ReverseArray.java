import java.util.Scanner;

public class Recursion07_ReverseArray {

    static void reverseArray(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    static void printArray(int[] arr, int n) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, n - 1);
        System.out.print("Reversed Array: ");
        printArray(arr, n);

        sc.close();

    }

}
