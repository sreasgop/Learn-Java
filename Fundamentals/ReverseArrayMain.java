public class ReverseArrayMain {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        reverseArray(arr);
        printArray(arr);        
    }

    public static void reverseArray(int[] array){
        int temp;
        int j = array.length - 1;

        for(int i=0; i<j; i++, j--){
            temp = array[i]; 
            array[i] = array[j]; 
            array[j] = temp;
        }
    }

    public static void printArray(int[] array){
        for(int num: array){
            System.out.print(num + " ");
        }
    }
}
