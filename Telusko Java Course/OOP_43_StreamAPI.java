import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;


public class OOP_43_StreamAPI {
    public static void main(String[] args) {
        
        List<Integer> listobj = Arrays.asList(2, 4, 3,5,7,6,8,10);

        // The .stream() method of the ArrayList Class returns the Object of Stream Interface
        // Whatever values we have in the ArrayList is available in the S1 steram objet. And whatever changes we make to the stream the changes are not going to affect the actual list. 
        Stream<Integer> s1 = listobj.stream();

        // The Stream interface provides several methods that we can use to perform operations on the data which in a way we can say is a temporary copy of the ArrayList. 
        // Using the .forEach() of the Stream interface we can access each of the values of the Stream object just the way we could access the data of an ArrayList using forEach and an implementation of Consumer Interface. 
        s1.forEach(n -> System.out.println(n));     
        
        // Note: An Important thing about Stream is that we cannot reuse a stream, in other words a Stream Objet can only be used to do one thing and after that the Stream gets disposed or closed. As a result we cannot even print the same stream twice using the .forEach() method, trying to do such will result in a run-time error. 



        // Creating a new Stream Object of the ArrayList 'listobj'
        Stream<Integer> s2 = listobj.stream();
        
        // Creating another Stream from the 2nd Stream using the .filter() method of Stream:
        Stream<Integer> s3 = s2.filter(n-> n%2==0); 
        // The shorthand Lamda function defines the condiiton n%2==0, which means that the new Stream is going to be populated with values which returns remainder 0 which divided by 2, in other words the s3 Stream object is going to have all even numbers. 

        // Creaing another Stream from the 3rd Stream using the .map() method of Stream:
        Stream<Integer> s4 = s3.map(n-> n*2);
        // We know that the 3rd Stream was created by filtering out the even numbers from the 2nd Stream and now we have created the 4th Stream by doubling the even numbers available in the 3rd Stream by using the .map() method. 
        
        // The .reduce() method gives us a single integer value. In this case we have used the .reduce() method to find out the sum of all numbers within the Stream object s4 which was a collection of all the even numbers of the ArrayList 'listobj' doubled. The 1st parameter of the .reduce() method is the identity value which is a starting point for the reduction operation. It serves as the initial value for the accumulator and also as the default result if the stream is empty. In other words, which we use a for loop for calculate the sum of all the elements, we do set the value of the sum variable as 0 as a result the summation starts from there, in the reduce function the 1st parameter passed is the identity value which works in the similar way as the initial value of the sum variable.
        int result = s4.reduce(0, (i,j)->i+j);  
        System.out.println("Sum of even numbers of array doubled: "+result);


        // We can do all the above operations using Stream in much more conscise way in one line.
        // Each one of the Stream method returns a new stream, as a result by chaining the methods one after the other we can get complex operations done.
        // Note: Over here as well, each stream was closed right after it perform it's defined operation and each method returned a new Stream altogeher.  
        int sumOfArray = listobj.stream().filter(n -> n%2==0).map(n->n+1).reduce(0, (i,j)-> i+j);
        System.out.println(sumOfArray);
    }
}