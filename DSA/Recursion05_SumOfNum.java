// Given a number ‘N’, find out the sum of the first N natural numbers.

public class Recursion05_SumOfNum {

    static int sumOfNum(int n){
        if(n==0){
            return 0;
        } else {
            return n + sumOfNum(n-1);
        }
    }

    public static void main(String[] args){

        System.out.println(sumOfNum(5));

    }

}
