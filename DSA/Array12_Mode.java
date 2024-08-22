// Given an array of repeating and duplicate elements, figure ouf the mode element. (the element that is there in the array for max no of times)

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Array12_Mode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter an array of repeating/duplicate values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Mode: " + returnMode(arr));

        sc.close();
    }

    static int returnMode(int[] arr) {

        // Creating an array of unique elements:
        List<Integer> uniqueElements = new ArrayList<>();
        for (int element : arr) {
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
            }
        }

        // Convert list to array
        int[] uniqueArr = new int[uniqueElements.size()];
        for (int i = 0; i < uniqueElements.size(); i++) {
            uniqueArr[i] = uniqueElements.get(i);
        }

        // Step 2: Count frequencies
        int[] count = new int[uniqueArr.length];
        for (int num : arr) {
            for (int i = 0; i < uniqueArr.length; i++) {
                if (num == uniqueArr[i]) {
                    count[i]++;
                    break;
                }
            }
        }

        // Figuring out the maximum frequency:
        int max = count[0];
        int maxIndex = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
            }
        }

        // Returning the Mode:
        int mode = uniqueElements.get(maxIndex);
        return mode;

    }
}
