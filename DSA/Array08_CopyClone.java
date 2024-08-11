// We can copy an array to another by using the .arraycopy() method of the System Class:
// System.arraycopy() is a method used to efficiently copy data between arrays.
// It takes 5 parameters: 
// 1st Parameter (src): The source array from which elements will be copied.
// 2nd Parameter (srcPos): The starting index in the source array from which copying begins.
// 3rd Parameter (dest): The destination array where the elements will be copied to.
// 4th Parameter (destPos): The starting index in the destination array where elements will be placed.
// 5th Parameter (length): The number of elements to copy from the source to the destination, starting from scrPos (2nd Parameter).

public class Array08_CopyClone {
    public static void main(String[] args){

        // Copying an Array using System.arraycopy():
        // Creating an array: 
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Creating a 2D array:
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Creating a new array in which we want to copy elements from the arr1: 
        int[] copyArr = new int[5];

        // Using System.arraycopy() we are coping elements from arr1 to copyArr:
        System.arraycopy(arr1, 4, copyArr, 0, 5);

        // Printing Copy Array:
        System.out.print("Copy of arr1: ");
        for (int i : copyArr) {
            System.out.print(i+" ");
        }
        System.out.println();




        // Cloing an Array using .clone() method of Arrays: 
        // Since, Java array implements the Cloneable interface, we can create the clone of the Java array. If we create the clone of a single-dimensional array, it creates the deep copy of the Java array. It means, it will copy the actual value. But, if we create the clone of a multidimensional array, it creates the shallow copy of the Java array which means it copies the references.
        
        // Cloning a 1D array:
        // Cloning a single dimensional array will give us a deep copy, which means we get a new array altogether with new copied values, in other words if we modify the values of the clonned array it will not impact the original array where we cloned from. 

        int[] clonearr1 = arr1.clone();

        System.out.print("Clone of arr1: ");
        for (int i : clonearr1) {
            System.out.print(i+" ");
        }
        System.out.println();



        // Cloing a 2D array:
        // Cloing a multi-dimensional array will give us a shallow copy, which means that we aren't getting an array of new elements, rather we are getting an array that is reffering to the values of the original multi-dimensional array, which also means that if we modify any value in the cloneed array values in the original multi-dimensional array will also change. 

        int[][] clonearr2 = arr2.clone();

        System.out.println("\nClone of arr2: ");
        for (int[] arr : clonearr2) {
            for(int i: arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        
        // let us try to change a value in the cloned multi-dimensional array:
        clonearr2[0][0] = 99;       // We have changed the value of the element of 1st row, 1st column to 99 in the cloned array.

        // We will be able to see that the value has also been changed in the original multi-dimensional array, which proves the point that .clone() returns a shallow array in case of multi-dimensional arrays. In other words when we clone a multi-dimensional array using .clone() it copies the references to the original multi-dimensional array in the cloned one. 

        // Let us try to print the original multi-dimensional array:
        System.out.println("\n\nPrinting the original Muti-dimensional Array: ");
        for (int[] array : arr2) {
            for(int i: array){
                System.out.print(i+" ");
            }
        }
    }

}
