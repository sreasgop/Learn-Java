public class MethodOverloading {      
  public static void main(String[] args) {

        // operations newobj = new operations();

        int myNum1 = operations.plusMethod(8, 5);
        double myNum2 = operations.plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
      }
}

class operations{
  static int plusMethod(int x, int y) {
    return x + y;
  }
  
  static double plusMethod(double x, double y) {
    return x + y;
  }
}