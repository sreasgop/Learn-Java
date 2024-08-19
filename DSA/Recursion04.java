// Print from N to 1 using Recursion without using a global variable.

public class Recursion04 {
    public static void main(String[] args) {
        printNum(10);
    }

    // The function can print 10 to 1 using only one parameter as we have changed the base case condition to be equal to 0. Which means that if n equals to 0 the function will stop calling itself. 
    static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printNum(n-1);
    }
}
