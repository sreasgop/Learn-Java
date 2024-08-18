// Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

public class Array05_CheckIfSorted {
    public static void main(String[] args) {
        
        System.out.println("Sorted: "+isSorted(new int[]{10, 20, 30, 53, 81, 100}));
        System.out.println("Sorted: "+isSorted(new int[]{10, 20, 54, 53, 81, 100}));
        System.out.println("Sorted: "+isSorted(new int[]{19, 31, 53, 58, 59, 91, 2000}));

    }
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
