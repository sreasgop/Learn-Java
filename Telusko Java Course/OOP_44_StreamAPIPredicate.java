import java.util.List; 
// import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.stream.Stream;
import java.util.function.Predicate;

public class OOP_44_StreamAPI2 {
    public static void main(String[] args){

        List<Integer> listObj = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);



        // Creating an implement of Stream interface using the .stream() method of ArrayList
        Stream<Integer> s1 = listObj.stream();

        int result = s1.filter(n-> n%2==0).map(n->n*2).reduce(0, (i,j) -> i+j);
        System.out.println(result);




        // Creating another implementiton of the Stream interface using the .stream() method of ArrayList
        Stream<Integer> s2 = listObj.stream();

        // Let us take a deeper look at how each one of the methods of Stream really works:
        // The .filter() method of the Stream interface returns a stream consisting of the elements of this stream that match the given Predicate. In other words the .filter() method takes an object of any implementation of the Predicate Interface. Predicate is a functional interface that represents a condition or a test that returns a boolean value (true or false).

        // Creaing an anonyous class implementation of the Predicate Funtional Interface:
        // Afterwards, we can pass the reference name of the anonymous class implementatoin of the Predicate Functional Interface to the .filter() method of any Stream implementation to be able to return the elements of the stream that match the given condition of the Predicate. 
        Predicate<Integer> newPredicate = new Predicate<Integer>() {
            public boolean test(Integer n){ // The following test functional method helps us 
                if(n%3==0){
                    return true;
                } else {
                    return false;
                }
            }
        };

        // Passing the Anonymous Class Implementation with reference name of the Predicate Functional Interface as a parameter to the .filter() method of the Stream Interface.
        s2.filter(newPredicate);




        // Creating another anonymous class implementation of the Predicate Functional Interface:
        Stream<Integer> s3 = listObj.stream();

        // Doing the same thing all over again but this time around using a Shorthand Lamda Expression Implementation of the Predicate Functional Interface and also using ternay operator to write the test functional method. 
        Predicate<Integer> newPredicate2 = n -> n%3==0?true:false;      
        s3.filter(newPredicate2);

        
        // In this example if we pay attention to the later part, where we are defining the functional method to the reference type Predicate, we see that it's not that different from the parameter we have been pasing till this point to the .filter() method. 
        
        // e.g. let s1 be a Stream we would do the following thing: 
        
        // s1.filter(n-> n%2==0?true:false);
        // OR
        // s1.filter(n -> n%2==0);       // This would also work as we were anyway returning true if the condition n%2==0 was true and false if the condition wasn't true. 





    }
}
