// The .map() method of Stream Interface takes an Object of reference type of Function Interface, which is a part of the java.util.function package. The Function Interface is a functional interface which means that it only has one abstract method that needs to be implemented, and just any other functional interface, the Function Interface can be implemented using an Anonymous class or a lamda expression. 

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.Function;


public class OOP_45_StreamAPIFunction{
    public static void main(String[] args){

        List<Integer> arrObj = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Creating a Stream Object out of the ArrayList with reference name arrObj.
        Stream<Integer> s1 = arrObj.stream();

        // Function Interface and it's .apply() abstract method which method takes one argument and returns a result.
        // Syntax of Functional Interface:
        // @FunctionalInterface
        // public interface Function<T, R> {
        //     R apply(T t);
        // }

        // T: The type of the input to the function.
        // R: The type of the result of the function.

        // Method apply(T t): This is the method that you need to implement when using the Function interface. It takes one argument of type T and returns a result of type R.

        // Why Does Function Have Two Generics (T, R)?

        // Input and Output: The primary reason Function<T, R> has two generic types is that it is designed to both take an input of one type (T) and return a result of another type (R). This is different from Predicate and Consumer, which either return a fixed type (boolean for Predicate) or don't return anything at all (void for Consumer).
        // Flexibility: The two generic types allow Function to be more flexible. It can be used in situations where the input and output types differ, making it versatile for various transformation operations.




        // Creating an Anonymous Class implementation of the Function Interface with reference name 'func' to multiply all the values of the 's1' Stream by 2:
        Function<Integer, Integer> func = new Function<Integer, Integer>() {
            public Integer apply(Integer i){
                return i*2;
            }
        };
        
        // We can simply pass the Anonymous Class Implementation of the Function Interface to the .map() method of the Stream Object s1 as an Argument and things will work just fine. 
        System.out.println("Anonymous Class Implemention of Function Interface being passed to .map() method of Stream:");
        s1.map(func).forEach(n-> System.out.print(n+" "));
        System.out.println("\n");




        // Creating another Stream Object out of the ArrayList object with reference name arrObj:
        Stream<Integer> s2 = arrObj.stream();
        
        // Creating a Lamda Expression Implementation of the Function Interface with reference name 'newfunc' to increment all the values of the Stream by 1:
        Function<Integer, Integer> newfunc = n-> n+1;

        System.out.println("Lamda Expression Implementation of Function Interface being passed to .map() method of Stream:\b");
        s2.map(newfunc).forEach(n-> System.out.print(n+" "));
        System.out.println("\n");




        // Creating another Stream Object of the ArrayList object with reference name arrObj:
        Stream<Integer> s3 = arrObj.stream();

        // Passing a Shorthand Lamda Expression of the Function Interface without any reference name to make all the numbers a multiple of 100 directly within the .map() method of the Stream Object:
        System.out.println("Lamda Expression Implemention of Function Interface being passed directly to .map() method without a reference name:");
        s3.map( n -> n*100 ).forEach( n -> System.out.print(n+" ") );
        System.out.println();


    }
}