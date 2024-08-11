// Data can be stored in a matrix form using multidimensional arrays. A multidimensional array in Java is an array of arrays, allowing you to store data in a grid or table format. Each element of a multidimensional array can itself be an array, giving you multiple "levels" of indexing.

public class Array05_2DArray {
    public static void main(String[] args) {
        
        // Declaring a 2D Array:
        int [][] arr1;
        
        // Instantiating a 2D Array:
        arr1 = new int[3][3];

        // Initializing a 2D Array:
        arr1[0][0]=1;  
        arr1[0][1]=2;  
        arr1[0][2]=3;  
        arr1[1][0]=4;  
        arr1[1][1]=5;  
        arr1[1][2]=6;  
        arr1[2][0]=7;  
        arr1[2][1]=8;  
        arr1[2][2]=9;

        // Printing using for loop:
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n");


        // Declaring, Instantiating and Initializing 2D array in the same line.
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Using for-each/ enhanced for loop to acces the elements of the 2D array
        for (int[] i : arr2) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
