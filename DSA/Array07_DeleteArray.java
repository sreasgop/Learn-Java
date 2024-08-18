public class Array07_DeleteArray {
    public static void main(String[] args) {

        int[] arr = {12, 1, 20, 100, 9, 0};

        int newSize = deleteElement(arr, 20);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         
    }
    
    public static int deleteElement(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                while(i != arr.length-1) {
                    arr[i] = arr[i+1];
                    i++;
                }
                break;
            }
        }
        return arr.length - 1;
    }
}
