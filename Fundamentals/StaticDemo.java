public class StaticDemo{
    public static void main(String[] args) {
        System.out.println(MathUtils.add(10, 20));
    }
}

class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}
