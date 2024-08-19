// Print from 1 to N using Recursion without using a global variable. 

public class Recursion03 {
    public static void main(String[] args) {
        printNum(1, 10);        
    }

    static void printNum(int i, int n){
        if(i>n){
            return;
        }
        System.out.print(i + " ");
        printNum(i+1, n);
    }
}
