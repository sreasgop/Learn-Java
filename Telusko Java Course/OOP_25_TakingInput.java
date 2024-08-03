// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class OOP_25_TakingInput {
    public static void main(String[] args) {
        
        // System.out.print("Enter a number: ");
        // System.in.read() returns an ASCII value and it only reads the first character's ASCII value so we can't know the ASCII value of a two digit number. 
        // int userNum = System.in.read();
        // System.out.println("ASCII Value: " + userNum);    
        // System.out.println("Numeric Value: "+ (userNum-48));    // We know that ASCII value for 0 is 48 so if we subtract 48 from the userNum we will get the true value.    




        // OLD METHOD: Previously before Java version 1.5 people used to take help of InputStreamReader and BufferedReader classes to take input. 
        // The BufferedRead requires tackling 
        // System.out.print("Enter another number: ");
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bfr = new BufferedReader(in);         // BufferedReader can take input from a file or a Database as well. 

        // int user_input = Integer.parseInt(bfr.readLine());       // Read line outputs in String data type so we need to type cast it to integer using Integer.parseInt(). 
        // System.out.println(user_input);
        // bfr.close();    // BufferedReader instance is a resource so we need to close it when we are done using it. 




        // NEW METHOD: After Java version 1.5 people have been using the Scanner class to read data.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.println("Integer: "+num);
        sc.close();
    }
}
