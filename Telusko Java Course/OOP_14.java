interface Computer{
    void speedOfWork();
}

class Desktop implements Computer{
    public void speedOfWork(){
        System.out.println("Fastest: Code, Compile, Execute.");
    }
}

class Laptop implements Computer{
    public void speedOfWork(){
        System.out.println("Moderate: Code, Compile, Execute.");
    }
}

class Mobile implements Computer{

    public void speedOfWork() {
        System.out.print("Slow: Code, Execute.");
        System.out.println(" Slowest: Compile");
        
    }
}

class MacBook extends Laptop{
    public void show(){
        System.out.println("I am an apple product!");
    }
}

class Programmer{
    public void Code(Computer Device){
        Device.speedOfWork();
    }
}


public class OOP_14 {
    public static void main(String[] args){

        // Machines:
        Computer machine1 = new Desktop(); 
        Computer machine2 = new Laptop();
        Computer machine3 = new Mobile(); 
        
        Computer applemachine = new MacBook();


        // Developer: 
        Programmer newEmployee = new Programmer();

        System.out.print(machine1.getClass().getSimpleName()+" = ");
        newEmployee.Code(machine1);
        
        System.out.print(machine2.getClass().getSimpleName()+" = ");
        newEmployee.Code(machine2);

        System.out.print(machine3.getClass().getSimpleName()+" = ");
        newEmployee.Code(machine3);

        System.out.print(applemachine.getClass().getSimpleName()+" = ");
        newEmployee.Code(applemachine);

    }    
}
