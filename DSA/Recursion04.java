// Print from N to 1 using Recursion without using a global variable.

public class Recursion04 {
    public static void main(String[] args) {
        printNum(10);
    }

    static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printNum(n-1);
    }
}
