// A functional interface is an interface which only has one method.

interface SampleInterface{
    void show();
}


// Let's create another functional interface to demonstrate the usage of parameters in Lamda Expressions. 
@FunctionalInterface
interface ParameterizedInterface{
    void add(int a, int b);
}


public class OOP_20_LamdaExpression {
    public static void main(String[] args) {
        
        // Creaing an Anonymous Inner Class of the reference type of Interface SimpleInterface and then instantiating. 
        // SampleInterface obj = new SampleInterface() {
        //     public void show(){
        //         System.out.println("In show.");
        //     }
        // };

        // obj.show();


        // Lamda Expression: Lamda expression can only be used with Functional Interfaces. From Java 8 onwards we have support for Lamda Expression which makes the syntax a lot more easier and simple. Also when this program gets compiled we have less number of .class files to handle. We know that Anonymoys Inner Classes makes a .class file of their own with the name of the class they are defined in but in case of Lamda Expression we don't see that happening. For this example:

        // For the previous anonymous inner class the following .class files are added: OOP_20_LamdaExpressions$1.class

        // For the lamda Expression we simply get a OOP_20_LamdaExpression.class file which is slightly bigger in size

        // // Syntax of Lamda Expression:
        SampleInterface newObj = () -> {
            System.out.println("Hello World: From Lamda Expression");
        };
        newObj.show();


        // When we have only one line in our abstract method than we can also get rid of the curly braces and write the lamda expression in an even simpler form.
        SampleInterface newObj2 = () -> System.out.println("Simlpe Lamda Expression!");
        newObj2.show();


        // When passing parameters in Lamda Expressions we don't even need to mention the data types as in the declaring of the method in the interface the data type was mentioned as a result while creating the lamda expression we can ommit using the data types altogether. Also if we have only one parameter we can also skip using the parenthesis covering the parameter. 
        ParameterizedInterface obj = (i, j) -> System.out.println("Addition: "+ (i+j));
        obj.add(10, 20);

    }
}
