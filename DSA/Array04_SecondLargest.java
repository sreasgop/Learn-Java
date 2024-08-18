// // Given an array, we have to find the second largest element in the array.

public class Array04_SecondLargest{
    public static void main(String[] args) {
        System.out.println("Second Largest: "+secondLargest(new int[] {10, 30, 14, 100, 40, 91, 69}));
    }

    public static int secondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>largest) {
                secondLargest = largest;
                largest = i;
            } else if (i>secondLargest & i!=largest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}