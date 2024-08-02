// Types of Error: 
// 1. Compile Time Error
// 2. Run Time Error: The application/program opens just fine and stops in the middle while running is called runtime error. When the execution stops in betweem it's called Run-Time Error.
// 3. Logical Error

public class OOP_22_Error {
    public static void main(String[] args) {

        int i = 2; 
        int j;
        
        int[] arr = new int[5];

        // Trying to divive by zero will raise a runtime exception called / by zero. We can make sure that the program keeps on running even if it encounters that run time exception and we can do that by putting the block of code tha might raise an exception within the try block and then catch the error using the catch block.

        // When there are multiple critical satements within a try block, if any critical statement from the first segment fails the remaining try block doesn't get executed. For instance, in this example if the division by zero triggers an exception this try block won't get to execute the array accessing line. 

        try{
            j = ((int)(Math.random()*11))/i;
            System.out.println(j);
            System.out.println(arr[5]);     // We know arr[5] doesn't exist as arr[4] is the index of the last element in an array of 5 elements. 

        } catch (ArithmeticException ae){
            System.out.println("Error: Division by Zero attempted.\t"+ae);
        } catch (ArrayIndexOutOfBoundsException arraye){
            System.out.println("Error: You tried accessing an element that doesn't exist in the array.\t");
        }
        catch (Exception e){  // This catches all sorts of exceptions which is a problem if we are handling multiple critical error prone statements within one try block
            System.out.println("Something went wrong!\t"+e);
        }
        
        System.out.println("Bye");
    }
}
