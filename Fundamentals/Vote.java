// Write a program to ask the user for a number and then print if the user can vote or not. 

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You Can Vote!\n");
        } else {
            System.out.println("Cannot Vote! You've gotta wait for " + (18-age) + " Years\n");
        }

    }
}
