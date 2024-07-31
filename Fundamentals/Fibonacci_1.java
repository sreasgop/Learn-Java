import java.util.Scanner;

public class Fibonacci_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Term: ");

        int n = sc.nextInt();

        sc.close();

        long firstTerm = 0; 
        long secondTerm = 1;
        long thirdTerm;

        for(int i=0; i<n; i++){
            System.out.print(firstTerm+" ");
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        
    }
}
