import java.util.Scanner;

public class TimesTable{
    public static void main(String[] args){

        if(args.length>0){

            // Converting the Command line argument from String data type to integer.
            int num = Integer.parseInt(args[0]);
            
            for(int i=1; i<11; i++){
                System.out.println(num + " x " + i + " = " + num*i);
            }  

        } else {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number to variable: ");
            int user_input = sc.nextInt();

            sc.close();

            TimesTable.Calc(user_input);

        }

    }

    // Global Variable to control the recursive function
    static int i = 1;

    // Times Table Calculating Recursive 
    static void Calc(int num){
        if(i!=11){
            System.out.println(num + " x " + i + " = " + num*i);
            i+=1;
            Calc(num);
        }
        return;
    }
}