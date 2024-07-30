// We cannot create object of Abstract Class

abstract class Car{  
    
    // If we want to declare a method without defining it we are suppoed to create a method of abstract type. But it is to be kept in mind that abstract method can only be defined in abstract class, so in order for us to have methods that are declared and not defined we need to have abstract classes in order to be able to create abstract methods which we can only declare without defining. 

    public abstract void drive();    // Declaering a method

    public void playMusic(){        // Defining a method along with declaring it 
        System.out.println("Play Music");
    }
}

class WagonR extends Car{

    public void drive(){
        System.out.println("Driving");
    }

}


public class OOP_9 {
    public static void main(String[] args) {

        // We cannot create an object of an Abstract class
        // Car obj = new Car();

        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
