// An Anonymous array is the type of array that doesn't have a reference name, we usually use anonymous array to pass an array to a method or return an array from a method. 

// We create an anonymous array using the following syntax:
//new datatype[]{data_element_1, data_element_2, data_element_3, .......}

public class Array03_AnonymousArray {

    // The following method takes an array of interger as input and prints double of each integer element:
    public static void doubleArr(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(i*2+" ");
        }
        System.out.println();
    }

    // The folling method takes an array of strings as parameter and prints the length of each string element and also returns an array of integers containing the lengths of each string elements.
    public static int[] displayStrLength(String[] arr){
        int[] strlenarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            strlenarr[i] = arr[i].length();
            System.out.print(strlenarr[i] + " ");
        }
        System.out.println();
        
        return strlenarr;
    }


    public static void main(String[] args){

        // This is how we create an anonymous array:
        // new int[]{2, 4, 6, 8, 10};       // But we can't simply create an Anonymous array without having a left side assigned 

        
        // Passing an Anonymous Array in a method that receives an array:
        doubleArr(new int[]{12, 4, 1, 21, 30, 7, 14});


        // Passing an Anonymous Array of Strings in a method that 
        displayStrLength(new String[]{"Chandra Sreas Gop", "Soutrika Das", "Sanjib Kumar Sah", "Unnati Kumari", "Khushi Dubey"});


        // We cam also assign an anonymous array to a reference of array but that however defines the entire point of having an anonymous array
        int[] arr1 = new int[]{0, 1, 1, 2, 3, 5, 8, 13};
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
