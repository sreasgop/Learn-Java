// Given an array of N integers, left rotate the array by d place.

public class Array09_LeftRotate2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        leftRotateD(arr1, 2);

        for (int i : arr1) {
            System.out.print(i+" ");
        }

    }

    static void leftRotateD(int[] arr, int d){
        d = d % arr.length;

        int[] tempArr = new int[d];
        for (int i = 0; i < d; i++) {
            tempArr[i] = arr[i];
        }

        for (int i = 0; i < arr.length - d ; i++) {
            arr[i] = arr[i+d];
        }

        for(int i = 0; i < d; i++){
            arr[arr.length - d + i] = tempArr[i];
        }
    }
}