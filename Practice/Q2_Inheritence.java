// Question: Create a class Vehicle with properties brand, model, and year. Then create a subclass Car that adds properties like numberOfDoors and convertible. Write methods in both classes to display their respective details.
// Focus: Understanding "is-a" relationships and using the extends keyword.

class Vehicle{
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter Methods:
    public String getbrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "\nCar\n[ brand = " + brand + " ]\n[ model = " + model + " ]\n[ year = " + year + " ]\n";
    }
    
}

class Car extends Vehicle{

    protected int numberOfDoors;
    protected boolean convertible;

    
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    public Car(String brand, String model, int year, int numberOfDoors, boolean convertible){
        this(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.convertible = convertible;
    }


    // Setter Methods:
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    } 


    // Getter Methods:
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public boolean isConvertible() {
        return convertible;
    }
    
}


public class Q2_Inheritence {
    public static void main(String[] args) {

        // Creating an Object of Car Class:
        Car carObj1 = new Car("BMW", "Z4", 2014);

        // Using setter methods to set values to attributes:
        carObj1.setNumberOfDoors(2);
        carObj1.setConvertible(true);

        // Printing the Details of the Object:
        System.out.println(carObj1);

        

        // Creating a car object with reference type variable of Vehicle type: 
        Vehicle alto = new Car("Maruti Suzuki", "800", 2018, 4, false);
        System.out.println(alto);


        // Using getter methods to retreive values:
        System.out.println(carObj1.getbrand());
        System.out.println(carObj1.getModel());
        System.out.println(carObj1.getYear());
        System.out.println(carObj1.getNumberOfDoors());
        System.out.println(carObj1.isConvertible());
    }
}
