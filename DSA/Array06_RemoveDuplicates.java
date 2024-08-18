// Remove duplicates from in place from a sorted array: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same. If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

public class Array06_RemoveDuplicates {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 20, 30, 30, 30, 40, 40, 50};
        int newSize = removeDupliate(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static int removeDupliate(int[] arr){
        int index = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[index]!=arr[j]){
                index++;
                arr[index] = arr[j];
            }
        }
        return index + 1;
    }
}
