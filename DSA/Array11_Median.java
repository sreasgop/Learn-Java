// The mediam of an array of numbers is the element m of the array such that half the remaining numbers in the array are greater than or equal to m and half are less than or equal to m, if the number of elements in the array is odd. If the number of elements is even, the median is the average of the two elements m1 and m2 such that half remaining elememts are greater than or equal to m1 and m2, and half the elements are less tha or equal to m1 and m2. Write a program that acceps an array of numbers and returns the median of the numbers in the array. 

public class Array11_Median {
    public static void main(String[] args) {
        System.out.println(returnMedian(new int[]{1, 2, 3, 4, 5, 6}));
    }   
    
    static float returnMedian(int[] arr){
        float median = arr[arr.length/2]; 
        if(arr.length%2==0){
            median = ((float) arr[arr.length/2] + arr[(arr.length/2+1)])/2;
            return median;
        }
        return median;
    }
}
