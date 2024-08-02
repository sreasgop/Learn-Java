
// If we want to create a new exception we must extend the Exception() class or the RuntimeException() class. Only then the exception is supposed to be a valid one. 
class NotEvenException extends Exception{
    
    // This constructor of the NotEvenException() is calling the constructor of it's superclass that is the constructor of the Exception() class.
    public NotEvenException(String errMsg){
        super(errMsg);      
    }
}


public class OOP_23_Exception {
    public static void main(String[] args) {

        int var = 4;
        int num = 12;

        try{

            int result = num / var; 
    
            // If I don't divide the number by zero or mess up the execution in any way no exception will be triggered, as a result the catch blocks won't run at all. But I can choose to throw an exception for a specific condition we can do that using the throw keyword. 
            
            // if we want to throw an exception when the result is 0 rather than returining zero we can do that. 
            // if(result==0){
            //     throw new ArithmeticException("Error: Result is Zero!");        // I am creating a new instance of the ArithmeticException() class and raising it if the result is 0.
            // }

            // Creating our own Exception
            // For example if we want to raise an exception if the result is not even we can do that creating our own exception.
            // We know that ArithmeticException() is a sub class of the Exception() super class. And we can create a sub class of the Exception() superclass and then throw it using the throw keyaord. We should keep in mind that if we throw our own exception, the first catch block that we have written for ArithmeticException() will not work and the latter catch block will be executed as the class we will be throwing is a sub class of Exception() class. 
            if(result%2==0){
                throw new NotEvenException("Result turned out to be an error!");
            }

            System.out.println(result);


        } catch(ArithmeticException ae){    // We know that this line will take care of Arithmetic Exceptions like division by zero that may encounter while running the try block.
            System.out.println(ae);  //  
        } catch (NotEvenException ne){
            System.out.println(ne);
        } catch(Exception e){              // This line will take care of all the Exceptions we might encounter while trying to run the try block.
            System.out.println("Something went wrong.");
        }
        
        System.out.println("Bye bye");

    }
}
