
class Human{

    private int age;        // Private instance variable is only accessible only in this class
    private String name;    // Therefore a method of this very class will be be able to both set value to these variables and access the variable as well. 

    // Encapsulation: Binding the data with the methods so that we can use methods to access the values is called encapsulation.
    
    // Setter Methods
    public void setAge(int user_age){
        this.age = user_age;
    }

    public void setName(String user_name){
        this.name = user_name;
    }
 
    // Getter Methods
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

public class OOP_3_Encapsulation {

    public static void main(String[] args) {
        
        Human obj = new Human();
        obj.setAge(19);
        obj.setName("Chandra Sreas Gop");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }
}
