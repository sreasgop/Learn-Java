// Question: Create a class Engine with properties like horsepower and type. Then create a class Car that contains an Engine object and additional properties like make and model. Write methods to start the car, which should include starting the engine.
// Focus: Composition, object containment, and delegation.

class Engine{

    private int horsepower;
    private String type;

    public Engine(String type, int horsepower){
        this.type = type;
        this.horsepower = horsepower;
    }

    public void start(){
        System.out.println("\tEngine Stared!");
    }

    // Getter Methods:
    public String getType(){
        return this.type;
    }
    public String getHorsepower(){
        return Integer.toString(this.horsepower);
    }
}

class Car{
    private String brand;
    private String model;

    private Engine engineObj;

    public Car(String brand, String model, String engineType, int engineHorsePower){
        this.brand = brand;
        this.model = model;
        engineObj = new Engine(engineType, engineHorsePower);
    }

    public void start(){
        System.out.println("Car Turned on:");
        System.out.println("Turning on Engine: ");
        engineObj.start();
    }

    @Override
    public String toString(){
        return "Car\n [ brand: " + brand + " ]\n [ model: " + model + " ]\n [ engine type: " + engineObj.getType()+ " ]\n [ engine horsepower: "+ engineObj.getHorsepower() + "]\n";
    }


}

public class Q6_InheritenceHas{
    public static void main(String[] args) {

        Car carObj1 = new Car("BMW", "i8", "Hybrid (Electric + Petrol V6", 650);
        System.out.println(carObj1);

        carObj1.start();

        // Car carObj2 = new Car();

    }
}
