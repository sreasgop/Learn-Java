// Returning Array from Method:
// In the following program we will learn how to create a method that returns an array, just the way we mention the type of value a method is meant to return while creating it. In case of creating a method that returns an array we are suppposed to do it the same way. 

public class Array04_ReturnArray {
    
    // The following method returns an integer array of even numbers:
    static int[] getArr(){
        return new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    }

    // The folling method returns an array of n number of random elements: 
    static int[] getRandArray(int n){
        int[] tempArr = new int[n];
        for(int i = 0; i<n; i++){
            tempArr[i] = ((int)(Math.random()*101));
        }
        return tempArr;
    }

    // The folling method returns an array of Strings:
    static String[] getNames(){
        return new String[]{"Sreas", "Soutrika", "Sanjib", "Ayush"};
    }

    public static void main(String[] args){

        // Calling the getArr() method to make it return an array:
        int[] arr1 = getArr();

        // Printing the first Array
        for(int i: arr1){
            System.out.print(i+" ");
        }
        System.out.println();



        // Calling the getRanArr() method to get an array of n random elements, where n is the parameter we pass:
        int[] arr2 = getRandArray(10);
        
        // Printing the Second Array
        for (int i : arr2) {
            System.out.print(i+" ");
        }
        System.out.println();



        // Calling the getNames() method to get an array of string:
        String[] arr3 = getNames();
        
        // Printing the 3rd Array:
        for(String str: arr3){
            System.out.print(str+" ");
        }
        System.out.println();

    }
}
