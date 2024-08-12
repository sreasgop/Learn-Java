// Question: Create a base class Shape with a method calculateArea(). Then create subclasses Circle, Rectangle, and Triangle, each overriding the calculateArea() method to provide their specific implementations. Demonstrate polymorphism by creating an array of Shape objects and calculating the area for different shapes.
// Focus: Method overriding and runtime polymorphism.

class Shape{
    public float calculateArea(float data){
        return 0.0f;
    }
    public float calculateArea(float data1, float data2){
        return 0.0f;
    }
}

class Circle extends Shape{

    public final float PI = 3.1415f;

    @Override
    public float calculateArea(float radius){
        // We know that area of Circle is πr2.
        double area = PI*(Math.pow(radius, 2));
        System.out.printf("Area of Circle: %.2f Unit Sq.\n", area);
        return (float)area;
    }
}

class Rectangle extends Shape{
    
    @Override
    public float calculateArea(float length, float width){
        // We know that area of Rectabgke is L X B.
        float area = length * width;
        System.out.printf("Area of Rectangle: %.2f Unit Sq.\n", area);
        return area;
    }
}

class Square extends Shape{
    
    @Override
    public float calculateArea(float size){
        // We know that area of Square is Size x Size.
        float area = size * size;
        System.out.printf("Area of Sqare: %.2f Unit Sq.\n", area);
        return area;
    }
}

public class Q3_Polumorphism {
    public static void main(String[] args) {
        
        Shape[] shapArr = new Shape[3];

        shapArr[0] = new Circle();
        shapArr[0].calculateArea(5);
        
        shapArr[1] = new Rectangle();
        shapArr[1].calculateArea(10, 15);
        
        shapArr[2] = new Square();
        shapArr[2].calculateArea(12);
        

    }

}
