// Program to create an array, populate it with random numbers and then print it. 

public class ArrayRandom
 {
    public static void main(String[] args){

        // Declaring the array
        int[] num = new int[10];

        // Populating the array with random numbers
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*11);
        }

        System.out.print("Array: ");

        // Printing the array
        for(int n: num){
            System.out.print(n+" ");
            n = 0;
        }
        System.out.println();
    }    
}
