// Creaing anonymous inner classes of Runnable Reference Type to implement multi-threading in our program

public class OOP_29_Runnable{
    public static void main(String[] args){
        
        // Anonymous Inner Class of Runnable Reference type.
        Runnable runnableObj = new Runnable() {
            public void run(){
                for (int i = 0; i < 200; i++) {
                    System.out.println("Hi");
                }
            }
        };

        // Creating a Lamda Expression of the Runnable Reference Type
        Runnable runnableObj2 = () -> {
            for (int i = 0; i < 200; i++) {
                System.out.println("Hello");
            }
        };


        Thread newth = new Thread(runnableObj);
        Thread newth2 = new Thread(runnableObj2);

        newth.start();
        newth2.start();


    }
}