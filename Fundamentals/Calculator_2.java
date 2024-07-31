
class SimpleCalc{
    public static int calculate(int num1, char operator, int num2){
        int result = 0; 

        switch(operator){
            case '+':
                result = num1 + num2; 
                break;
            case '-':
                result = num1 - num2; 
                break; 
            case '*':
                result = num1 * num2; 
                break;
            case '/':
                result = num1 / num2;
                break;
            default: 
                System.out.println("Invalid Input! Try again with: +, -, *, /\n");
                break;
        }

        return result;
    }

}

public class Calculator_2 {
    public static void main(String[] args) {
        System.out.println("Addition: "+SimpleCalc.calculate(10, '+', 20));;
        System.out.println("Subtraction: "+SimpleCalc.calculate(10, '-', 7));;
    }
}
