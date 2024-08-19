// Given an array of N integers, left rotate the array by one place.

public class Array08_LeftRotate {
    public static void main(String[] args) {
        
        int[] arr1 = {10, 20, 30, 40, 50};
        leftRotate(arr1);

        for (int i : arr1) {
            System.out.print(i+" ");
        }

    }

    static void leftRotate(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = temp;
    }
    
}
