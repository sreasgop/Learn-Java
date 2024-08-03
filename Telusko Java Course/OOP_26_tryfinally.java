// The try block and finally block is used when we want to close resources, like closeable objects, files, etc. 
// The finally block gets executed irrespective of the try block executing successfully or not. As a result we also needed to use the throws keyword to throw exceptions because we used try and finally and not catch. We however could have used the catch blocks along with finally as well if we have wanted to. 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OOP_26_tryfinally {
    public static void main(String[] args) throws NumberFormatException, IOException{

        int num = 0; 
        // BufferedReader brf = null; 

        // try{
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     brf = new BufferedReader(in);
        //     num = Integer.parseInt(brf.readLine());
        //     System.out.println(num);
        // } finally{           // The finally block can be used to close resources. 
        //     brf.close();
        // }




        // New Method to close resources using try only:
        // try with resources

        // We are creating an object of BufferedReadere class and passing it an object of InputStreamReader in one line. And we are creating the object of BufferedReader class within the try block's parenthesis. 
        
        // Anything created with the parenthesis of the try block will be closed automatrically. 

        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter an integer: ");
            num = Integer.parseInt(bfr.readLine());
            System.out.println("Entered Value: "+num);
        }

    }
}
