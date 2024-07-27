public class JaggedArray {
    public static void main(String[] args){
        
        // Jagged array is a type of array in which all rows doesn't have equal number of columns. 
        
        int arr[][] = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*11);
            }
        }

        for(int array[]: arr){
            for(int n: array){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
