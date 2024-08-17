public class Array03_LargestElementRecursive {
    public static void main(String[] args) {
        
        LargestElement(new int[]{21, 81, 8, 100, 0, -1}, Integer.MIN_VALUE);
        LargestElement(new int[]{210, 81, 18, 10, 05, -10}, Integer.MIN_VALUE);
        LargestElement(new int[]{-20, 0, 2, 22, 12, -200, 102, 49, 201, 999, 21, -100, 90, 210}, Integer.MIN_VALUE);
    }

    private static int count = 0;
    public static void LargestElement(int[] arr, int lar){
        if(count==arr.length-1){
            System.out.println("Largest Element: "+lar);
            count = 0;      // Resetting the count value to 0, when the recursive function is coming an end to it's operaiton for an array.
            return;
        }
        if (arr[count]>lar){
            LargestElement(arr, arr[count++]);
        }
        else {
            count++;
            LargestElement(arr, lar);
        }
    }
}
