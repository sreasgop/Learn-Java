// If we are creating odd number of columns in a 2D array, it is known as a jagged array. In other words, it is an array of arrays with different number of columns.

public class Array06_JaggedArray {
    public static void main(String[] args){

        // In case of decalring and instantiating a Jagged Array we need to mention the number of rows. 
        int[][] jaggedarr1 = new int[3][];
        jaggedarr1[0] = new int[2]; 
        jaggedarr1[1] = new int[4]; 
        jaggedarr1[2] = new int[3]; 

        // Initializing a Jagged Array:
        for (int i = 0; i < jaggedarr1.length; i++) {
            for (int j = 0; j < jaggedarr1[i].length; j++) {
                jaggedarr1[i][j] = (int)(Math.random()*101);
                System.out.print(jaggedarr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
