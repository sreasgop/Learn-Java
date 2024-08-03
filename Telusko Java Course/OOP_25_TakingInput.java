import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OOP_25_TakingInput {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        System.out.print("Enter a number: ");
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(in);

        int user_input = Integer.parseInt(bfr.readLine());
        System.out.println(user_input);

    }
}
