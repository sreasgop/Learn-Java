// Question: Create an abstract class Employee with properties name and id, and an abstract method calculateSalary(). Create subclasses FullTimeEmployee and PartTimeEmployee that provide specific implementations of the calculateSalary() method.
// Focus: Abstract classes, abstract methods, and partial implementation.

abstract class Employee{
    
    private static int idSerial = 2024000;

    String name; 
    int id;

    public abstract int calculateSalary();

    // Constructors: 
    public Employee(String name) {
        this.name = name;
        this.id = idSerial++;
    }
    

    // Getter methods: 
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    // Setter Methods:
    public void setName(String name) {
        this.name = name;
    }

}


class FullTimeEmployee extends Employee{

    private int baseSalary = 20000;
    private int monthlyBonus = 15000;
    private int rentAllowance = 10000;
    private int finalSalary;
    
    
    public FullTimeEmployee(String name) {
        super(name);
    }


    public int calculateSalary(){
        this.finalSalary = monthlyBonus + rentAllowance + baseSalary;
        return this.finalSalary;
    }


    @Override
    public String toString() {
        return "FullTimeEmployee\n [ name = " + name + " ]\n [ id = " + id + " ]\n [ baseSalary = " + baseSalary + " ]\n [ monthlyBonus = "
                + monthlyBonus + " ]\n [ rentAllowance = " + rentAllowance + " ]\n [ finalSalary = " + finalSalary + "]\n";
    }
}


class PartTimeEmployee extends Employee{

    private int baseSalary = 10000;
    private int monthlyBonus = 5000;
    private int rentAllowance = 0;
    private int finalSalary;

    
    public PartTimeEmployee(String name) {
        super(name);

    }


    public int calculateSalary(){
        this.finalSalary = baseSalary + monthlyBonus + rentAllowance;
        return this.finalSalary;
    }
    

    @Override
    public String toString() {
        return "PartTimeEmployee\n [ name = " + name + " ]\n [ id = " + id + " ]\n [ baseSalary = " + baseSalary + " ]\n [ monthlyBonus = "
                + monthlyBonus + " ]\n [ rentAllowance = " + rentAllowance + " ]\n [ finalSalary = " + finalSalary + "]\n";
    }
}

public class Q05_Abstraction {
    public static void main(String[] args){

        Employee empObj1 = new PartTimeEmployee("Soutrika Das");
        empObj1.calculateSalary();

        Employee empObj2 = new FullTimeEmployee("Chandra Sreas Gop");
        empObj2.calculateSalary();

        System.out.println(empObj1);
        System.out.println(empObj2);

    }
}