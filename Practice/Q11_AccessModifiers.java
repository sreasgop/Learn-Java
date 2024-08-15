// Question: Create a class Student with properties like name, rollNumber, and grade. Use different access modifiers (private, protected, public, default) for these properties. Write a class in the same package and another in a different package to test access to these properties.
// Focus: Understanding the scope and accessibility provided by different access modifiers.


class Student{
    
    public String name;             // Other classes can directly access the this variable.
    protected int rollNumber;       // It's accessible within its own class, by subclasses (even if they are in different packages), and by other classes in the same package.
    private char grade;             // The instance variable is only accessible within the class it is declared in.
    Float marks;                    // Tihs is known as default access modfier or package-private, and is accessible only within its own package.
    
    public char getGrade(){
        return this.grade;
    }

    public void setGrade(char grade){
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + ", grade=" + grade + ", marks=" + marks + "]";
    }

}   

public class Q11_AccessModifiers {
    public static void main(String[] args) {
        
        Student stObj = new Student();

        // We can access the name instance variable directly using the . operator as the name instance variable has public access modifier. 
        stObj.name = "Chandra Sreas Gop";

        // We can access the rollNumber instance variable directly within any class in the same package and within any subclass in different packages as well as it is declared using the protected access modifier. 
        stObj.rollNumber = 2041;

        // Trying to directly access the 'grade' instance anywhere outside the class where it's defined will return an error as it's declared using private access modifier. 
        // stObj.grade = 'A';
        stObj.setGrade('A');

        // We can access the marks instance variable anywhere in the same package as it's declare using the default accesss modifier. 
        // stObj.marks = 99;

        System.out.println(stObj);

    }
    
}
