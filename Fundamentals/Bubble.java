import java.util.Scanner;

public class Bubble{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.print("Number of elements: ");
        int n = sc.nextInt(); 


        int[] array = new int[n];


        System.out.print("Enter "+ n +" elements: ");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();


        Sorting.BubbleSort(array);


        System.out.print("Sorted Array: ");
        for(int num: array){
            System.out.print(num+" ");
        }
        System.out.println();

    }
}

class Sorting{
    public static void BubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                }
            }
        }
    }
}