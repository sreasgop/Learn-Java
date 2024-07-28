// Write a program to ask the user to enter a number and tell whether entered number is even or odd. 

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int user_input = sc.nextInt();

        sc.close();

        if(user_input%2==0){
            System.out.println(user_input+" is an even number.");
        } else {
            System.out.println(user_input+" is an odd number.");
        }
        
    }
}
