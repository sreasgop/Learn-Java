// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables). Enum is short for "enumerations", which means "specifically listed".
// To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters.

// Difference between Enums and Classes
// An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

// An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

// Why And When To Use Enums?
// Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.


// enum is java extends the Enum class. 

// 
enum Status{
    RUNNING, FAILED, PENDING, SUCCESS;
}

public class OOP_16_Enum {
    public static void main(String[] args) {
        
        Status s = Status.RUNNING;
        
        switch(s){
            case RUNNING:
                System.out.println("All Good process will complete shortly.");
                break;
            case FAILED:
                System.out.println("Process failed, try again.");
                break;
            case PENDING:
                System.out.println("Please wait...");
                break;
            default:
                System.out.println("Process Completed Successfully.");
                break;
        }

    }
}
