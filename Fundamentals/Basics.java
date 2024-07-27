// package Telusko;
// Java is an general purpose object oriented programming language created in 1995 by a Sun Microsystems (which is now the subsidiary of Oracle) team lead by James Gosling. As a result James Gosling is also known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java.

// JDK (Java Development Kit) consits of JRE(Java Runtime Environment) and Javac (Java Compiler). 
// JRE consists of Java Libraries and JVM (Java Virtual Machine)

// In order to execute a Java File (Source Code written in Java) first we need to compile it using javac (java compiler) which will create byte code (Object file created by javac) with .class extension which can be executed in the JVM. 

public class Basics {
    public static void main(String[] args){

        Basics addition = new Basics();

        // public static void main(String[] args) This specific signature is required by the JVM when starting a Java Application. 

        // The String[] args is passed as the parameter of the main function and it let's us use command line parameters. Which means that when running a compiled java byte code we can pass an array of strings in the form of an argument to the main function. 

        // Example:
        // javac Basics.java                 ------> To Compile the file.
        // java Basics "string1" "string2"   ------> Passing Command line arguments to the program while running it. 


        // Printing Command Line Arguments: 
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        

        // NAMING CONVENTIONS IN JAVA:
        // Names can contain letters, digits, underscores, and dollar signs
        // Names must begin with a letter
        // Names should start with a lowercase letter, and cannot contain whitespace
        // Names can also begin with $ and _ (but we will not use it in this tutorial)
        // Names are case-sensitive ("myVar" and "myvar" are different variables)
        // Reserved words (like Java keywords, such as int or boolean) cannot be used as names

        // Naming variables using underscore and dollar sign in the beginning in legal in Java.
        // String _name = "Sanjib";
        // String $name = "Soutrika";


        // DATA TYPES: 

        // Primitive Data Types are predefined in java and primitive type always has a value assigned to it. A primitive data type starts with a lowercase letter. 

        // Primitive Data Types:               SIZE IN BYTES
        // byte byteNum = 127;                      // 1           // Stores whole numbers from -128 to 127
        // short shortNum = 32767;                  // 2           // Stores whole numbers from -32,768 to 32,767
        // int intNum = 20;                         // 4           // Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long longNum = 9223372036854775807L;     // 8           // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float pi = 3.14159f;                     // 4           // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // double longpi = 3.14159265358979d;       // 8           // Stores fractional numbers. Sufficient for storing 15 decimal digits
        // boolean bool = true;                     // 1 (Bit)     // Stores true or false values
        // char ch = 'S';                           // 2           // Stores a single character/letter or ASCII values
        

        // Non-Primitive Data Types are created by the programmer and is not defined by Java (except for data types like String). Non-Primitive data types can be used to call methods to perform certain operations and they always have an object overhead. 

        // Non-Primitive Data Types: 
        // String name = "Chandra Sreas Gop";


        // Printing Different data types 
        // System.out.println("\nPrimitive Data Types:\n");
        // System.out.println("byte: "+byteNum);
        // System.out.println("short: "+shortNum);
        // System.out.println("int: "+intNum);
        // System.out.println("float: "+pi);
        // System.out.println("boolean: "+bool);
        // System.out.println("String: "+name);
        // System.out.println("char: "+ch);

        // System.out.println("\nNew Ways to declare variables: \n");
        // System.out.println(_name);
        // System.out.println($name);


        // Widening Type Casting: (IMPLICIT TYPE CASTING/AUTOMATIC TYPE CASTING)
        // int num = 10; 
        // double newnum = num; 
        // String newname = "Soutrika Das";

        // Type checking 
        // System.out.println(((Object)newnum).getClass().getSimpleName());       // In case of a primitive data type fast new need to create an object of it in order to use the .getClass().getSimpleName() methods. 
        // System.out.println(newname.getClass().getSimpleName());               // As String is a non-primitive or reference type data to can directly use methods on it. 


        // Narrowing Type Casting: (EXPLICIT TYPE CASTING/MANUAL TYPE CASTING)
        // This type of conversion however isn't loss less, some data is always lost if we perfom narrowing conversions. 
        // double myDouble = 3.14156d;    
        // int myInt = (int) myDouble;         
        // System.out.println(myInt);

        // Mathematical Functionality using Math methods. 
        // System.out.println(Math.max(10, 15));
        // System.out.println(Math.min(10, 15));
        // System.out.println(Math.sqrt(81));
        // System.out.println(Math.abs(-100)); 
        // System.out.println((int)(Math.random() * 101));   // 0.0 (Inclusive) ---- 1.0 (Inclusive)


        // METHODS OR FUNCTIONS: 
        // A method is a block of code which only runs when it is called. We can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions. We use methods to reuse code: define the code once, and use it many times.
        // In Java a method/function must be declared within a class. It is defined with the name of the method, followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions:

        // Example: 
        // int addition(int a, int b){
        //     return a+b;
        // }

        System.out.println(addition.Newaddition(10, 20));

    }

    int Newaddition(int a, int b){
        return a+b;
    }
}   







// float ----> Primitive Data Type

// Float ---> Wrapper Class



// WRAPPER CLASS
// class Float{

    // Primitive Data Type
    // import float;

    //  METHODS
    // public addfloat();
    // public subfloat();
    // public fractionalpart();
    // public realpart();
// }


// float num1;    Empty Variable   Default value: 0.0f

// Float num1;    Instance of the wrapped class     Default value = NULL;



