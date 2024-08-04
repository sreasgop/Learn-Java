// Creating a thread using the Runnable class and than creating an object of the thread class to perform multi-threading in our program.
// Runnable is an interface that the threat class implements as well

class A implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");

            try {
                // This method keeps this thread away from going to the scheduler for the mentioned number of miliseconds. 
                Thread.sleep(10);       // Using the .sleep() method of the Thread class helps us halt the thread for a specificed time. 
            } catch (InterruptedException e) {
                System.out.println("Error: "+e);
            }

        }
    }
}

class B implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class OOP_28_Runnable {
    public static void main(String[] args){

        // Creating an instance of the A class that we have created implementing from the Runnable class. 
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        // Creating an instance of Thread class using the parameterized constructor of the thread class to pass the Object of A class with Reference type of Runnable. 
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

    }    
}
