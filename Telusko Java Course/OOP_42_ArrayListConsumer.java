import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.function.Consumer;

public class OOP_42_ArrayListConsumer{
    public static void main(String[] args) {
        
        // If we want to create an Arraylist of numbers in one go using multiple values, we can use the .asList() static method of the Arrays class. This static method returns an Arraylist with the given values as parameters to the static method as the elements of the newly created ArrayList. 
        List<Integer> numArray = Arrays.asList(2, 4, 3, 5, 7, 6, 8);

        // The .forEach() method of the ArrayList takes an Object of Consumer as a parameter and performs the given action by a Consumer reference type's anonymous class object for each iterable of the element until all elements have been processed or the action throws an exception. 
        
        // Consumer is a functional interface that belongs to the java.util.function package and the functional method is has is .accept() which takes a single input argument and returns no action as it's of void type. This functional method simply performs the operation specificed within on the given argument. 

        // How does the .foreach() method of the ArrayList class and the functional interface Consumer come together?
        // The .foreach() method of the ArrayList class keeps on performing the action defined in the functional method .acceot() of the Consumer interface again and again for each element of the ArrayLIst until all the elements have been processed. 
        

        // Anonymous Class Implementation of the Consumer functional interface with reference name 'con',
        Consumer<Integer> con = new Consumer<Integer>(){
            public void accept(Integer n){
                System.out.print(n+" ");
            }
        };  
        //  Calling the .forEach() method of ArrayList Class along with the reference of the Anonymous Class implementation of the Consumer functional interface. 
        System.out.print("Anonymous Class Implementaion of Consumer Functional Interface with a reference name: ");
        numArray.forEach(con);
        System.out.println();
        
        
        
        // Lamda Expression Implementation of the Consumer Functional Interface with a reference name 'newCon'.
        Consumer<Integer> newCon = n -> { System.out.print(n+" "); };
        // Calling .forEach() method of ArrayList class with the reference of the Lamda Expression implementation of the Consumer functional interface.
        System.out.print("Lamda Expression Implementaion of Consumer Functional Interface with a reference name: ");
        numArray.forEach(newCon);
        System.out.println();
        
        
        // As Consumer is a functional interface, which means that it only has only one functional method, therefore we can use a lamda expression to define the .accept() functional method without creating a reference of it. as well. In other words we can use the lamda expression within the .foreach() method of the ArrayList class and not create a refernce name at alL. However, this also means that we can use it only once as it doesn't have a name which we can use to call it again and again.  
        
        // Using the .forEach() method of ArrayList along with a shorthand lamda Expression of the Consumer Functional Interface:
        System.out.print("Shorthand Lamda Expression Implementaion of Consumer Functional Interface without any reference name: ");
        numArray.forEach(n -> System.out.print(n+" "));
        System.out.println();


        // Other Ways to traverse any ArrayList:

        // // Using for loop:
        // for(int i=0; i<numArray.size(); i++){
        //     System.out.print(numArray.get(i)+" ");
        // }
        // System.out.println();
        

        // // Using enhanced for loop:
        // for(Integer n: numArray){
        //     System.out.print(n+" ");
        // }
        // System.out.println();


        // // Using iterator:
        // Iterator<Integer> it = numArray.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next()+" ");
        // }
        // System.out.println();



        
    }
}