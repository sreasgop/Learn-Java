// Concepts of thread in java: 
// Threads are a programming construct that allows a program to perform multiple operations concurrently within the same process. Which thread is supposed to be exected is decided at runtime by the scheduler. 
// In Java, threads are fundamental units of execution within a program, allowing for concurrent processing. They enable multiple tasks to run simultaneously, enhancing the efficiency and responsiveness of applications, especially those performing I/O operations, complex computations, or requiring real-time interactions.

// Hardware threads (SMT/Hyper-Threading) refer to the capability of CPU cores to handle multiple instruction (multiple software threads) streams concurrently, improving utilization and efficiency.
// Software threads are programming constructs enabling concurrent execution within a program, mapped to hardware threads by the OS.

// Ways to create a new thread in Java:
// Thread Class: You can create a thread by extending the Thread class and overriding its run() method.
// Runnable Interface: Alternatively, you can implement the Runnable interface and pass an instance of the implementing class to a Thread obj

class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class OOP_27_Threads {
    public static void main(String[] args){
        
        // We can't control the operation of each thread individually as it's managed by the scheduler and it depends on it. However we can suggest the priority of a thread using the methods offered by the thread class. 
        
        A obj = new A();
        obj.start();
        obj.setPriority(Thread.MAX_PRIORITY);
        
        B obj1 = new B();
        obj1.start();

        System.out.println(obj.getPriority());
        
        
        System.out.println(obj.getPriority());
    }
}
