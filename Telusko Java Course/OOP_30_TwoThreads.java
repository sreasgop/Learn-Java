
// When working with multi-threaded programs in Java, using mutable variables can be challenging because multiple threads can access and modify these variables concurrently, potentially leading to inconsistent or unexpected behavior. To safely use mutable variables in a multi-threaded

// We can synchronize methods or blocks of code to ensure that only one thread can access the mutable variable at a time.

// Race Condition: When multiple threads modify a shared resource (like count in your example) concurrently, there’s a risk that the threads interfere with each other, leading to inconsistent or incorrect results

// Thread Safety: The synchronized keyword ensures that only one thread at a time can execute a particular section of code, preventing race conditions.

class Counter{

    int count; 

    // This increment method simply increments the value of the instance variable count by 1 everytime it's called. 
    public synchronized void increment(){       // Using synchronized will prevent separate threads from using the method at the same time.
        count++;
    }

    public int getCount(){
        return count;
    }

}

public class OOP_30_TwoThreads{
    public static void main(String[] args) throws InterruptedException{

        // Initializing an instance of Counter Class. 
        Counter obj = new Counter();

        // Creating a Lamda Expression of Runnable reference type
        Runnable runnableObj = () -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        };

        // Creating another lamda Expression of Runnable reference type
        Runnable runnableObj2 = () -> {
            for(int i = 0; i < 1000; i++){
                obj.increment();
            }
        };

        // Creating two instances of Thread class and passing Runnable Referencce Types as arguments to them.
        Thread thObj1 = new Thread(runnableObj);
        Thread thObj2 = new Thread(runnableObj2);


        thObj1.start();
        thObj2.start();

        // The join() method ensures that the main thread waits for the completion of the threads thObj1 and thObj2 before proceeding. If you don't use join(), the main thread may finish and print the counter value before the other threads have completed their execution. This is why we might see a result of 0: the main thread is printing the value of count before any of the increments have been performed.

        thObj1.join();
        thObj2.join();

        // Even if we make the main thread wait for thObj1 and thObj2 threads to finished their execution we still might see that we don't get 2000 as the output. That's the case because sometimes two threads are executed simultaneously preventing the count variable from getting incremented twice. For instance consider the value of the count variable is 2 and both thObj1 and thObj2 tries to increment it with 1 at the exact same time, in that case it's going to be incremented by 1 only rather that being incremented by 2 as two separate threads are incrementing it. And this is how we end up with inconsistent values. This is called a Race Condition, when multiple threads modify a shared mutable resource (like count) concurrently, there’s a risk that the threads interfere with each other, leading to inconsistent or incorrect results

        // Thread Safe: We can however overcome this challenge using synchronized keyword, which simply means that two multiple threads cannot simultaneously call the increment method, one thread as to wait for the other ones to get done with execution for it to be able to use the method. This is called making a method thread safe. 

        System.out.println(obj.getCount());

    }
}