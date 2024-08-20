// Given a number X,  print its factorial.

public class Recursion06_Factorial {
    
    static int factorial(int num){
        if(num==0){
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));    
    }

}