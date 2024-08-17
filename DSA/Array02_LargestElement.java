// Given an array, we have to find the largest element in the array.

public class Array02_LargestElement {
    
    public static void main(String[] args) {

        System.out.println("Largest: " + largestElement(new int[]{10, 281, 28, 0, -12, 400, 0, 12, 3}));

    }
    
    public static int largestElement(int [] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    
}
