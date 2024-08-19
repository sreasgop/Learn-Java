// Print from N to 1 using Recursion without using a global variable.

public class Recursion04 {
    public static void main(String[] args) {
        printNum(10, 1);
    }

    static void printNum(int i, int n){
        if(i<n){
            return;
        }
        System.out.print(i+" ");
        printNum(i-1, n);
    }
}
