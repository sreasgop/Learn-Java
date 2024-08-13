// Question: Create a class Person with properties name and age. Write multiple constructors: one that takes no arguments, one that takes only name, and one that takes both name and age. Demonstrate the use of these constructors by creating different Person objects.
// Focus: Constructor overloading and understanding how different constructors are invoked.

class Person{

    private String name;
    private int age;
    
    // Constructors:
    public Person(){};

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
            this.age = age;
    }


    // Getters:
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    // Setters: 
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }    


    @Override
    public String toString(){
        return "Person\n [ Name: " + name + " ]\n [ Age: " + age + " ]\n";
    }
}

public class Q8_Constructor {
    public static void main(String[] args) {
        
        // Creating a new Person using the default constructor
        Person newObj1 = new Person();
        System.out.println(newObj1);

        newObj1.setName("Chandra Sreas Gop");
        newObj1.setAge(19);

        System.out.println(newObj1);



        // Creating a new Person Object using the constructor that only takes the name as an argument. 
        Person newObj2 = new Person("Soutrika Das");
        newObj2.setAge(18);

        System.out.println(newObj2);



        // Creating a new Person Object using the constructor that only 
        Person newObj3 = new Person("Sanjib Kumar Sah", 20);
        System.out.println(newObj3);

    }    
}
