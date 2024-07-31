import java.util.Scanner;

public class PrimeMain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int userInput = sc.nextInt();

        sc.close();

        boolean isPrime = true;

        if(userInput<=1){
            isPrime = false;
        } else {
            for(int i=2; i<=userInput/2; i++){
                if( userInput%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(userInput+" is a prime number!\n");
        } else {
            System.out.println(userInput + " is an even number.\n");
        }
    }
}
