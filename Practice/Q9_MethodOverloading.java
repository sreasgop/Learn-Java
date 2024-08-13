// Question: Create a class Calculator with an add() method that can take two integers, two doubles, or three integers. Demonstrate method overloading by calling add() with different sets of arguments.
// Focus: Method overloading, compile-time polymorphism.

class Calculator{

    // Methods for two inputs: 
    public static int add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum: "+sum);
        return sum;
    }

    public static double add(double num1, double num2){
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
        return sum;
    }
    

    // Methods for three inputs:
    public static int add(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        System.out.println("Sum: "+ sum);
        return sum;
    }

    public static double add(double num1, double num2, double num3){
        double sum = num1 + num2 + num3;
        System.out.println("Sum: "+ sum);
        return sum;
    }
}


public class Q9_MethodOverloading{
    public static void main(String[] args) {
        
        // Using the method that takes two parameters:
        Calculator.add(10, 15);
        Calculator.add(5.50, 2.25);
        
        System.out.println();

        // Using the method that takes three parameters: 
        Calculator.add(10, 20, 30);
        Calculator.add(10.20, 15.15, 30.31);

    }
}