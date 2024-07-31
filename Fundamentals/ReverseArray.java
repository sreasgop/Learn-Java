import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.print("Enter elements of array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        int temp;
        int j = arr.length - 1;

        for(int i=0; i<j; i++, j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.print("Reversed Array: ");
        for(int num: arr){
            System.out.print(num+" ");
        }

    }
}
