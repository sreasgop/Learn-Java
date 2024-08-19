// Print your name n times using Recursion without using any global variable. 

public class Recursion02 {
    public static void main(String[] args) {
        printName(0, 3);
    }

    static void printName(int i, int n){
        if(i==n){
            return;
        }
        System.out.println("Sreas");
        printName(i+1, n);
    }

}
