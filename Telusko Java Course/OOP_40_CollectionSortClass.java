// In this program we are going to see, how to sort an ArrayList made up of elements of a certain class using the Collections.sort() static method and using an anonymous class of the Comparator Interface. 

// We know that Comparator interface has an abstract method called compare, which takes two values and helps us compare entities using the .sort() method. The Anonymous Class of the Comparator Intercace can be passed in the .sort() method along the reference type variable name of the collection that we want to solve. In this program we will sort the 


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String name; 
    int age;

    public Student(String name, int age){
        this.name = name; 
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class OOP_40_CollectionSortClass {
    public static void main(String[] args) {
     
        // Creating a List Reference Type variable and initializing it as an Object of ArrayList of Students. 
        List<Student> studs = new ArrayList<Student>();

        studs.add(new Student("Sreas Gop", 19));
        studs.add(new Student("Soutrika Das", 18));
        studs.add(new Student("Sanjib Kumar Sah", 20));
        studs.add(new Student("Sayane Gop", 16));

        System.out.println("\nStudent List before sorting: ");
        for (Student student : studs) {
            System.out.println(student+" ");
        }
        System.out.println();

        // We can't simply use the Collections.sort() static method to sort this ArrayList of Student data type. 
        // Because the Stuednt data type doesn't inherit the Comparable interface and the compareTo() method of the Comparable interface isn't overridden in the Student class, as a result if we use .sort() without a Comparator we will get error. 
        
        // Collections.sort(studs);     // This will throw an error.

        // Creating a anonymous class of the Comparator interface, that helps compare two Student elements of the ArrayList of Student on the basis of their age.
        Comparator<Student> com = new Comparator<Student>(){
            public int compare(Student i, Student j){
                if(i.age>j.age){
                    return 1;   // Return 1 means the values will be swapped. 
                } else {
                    return 1;   // Return 1 means the values won't be swapped. 
                }
            }
        };

        // Calling the .sort() static method of the Collections Class along with the Comparator being passed in the argument.
        Collections.sort(studs, com);

        System.out.println("Student List after sorting: ");
        for (Student student : studs) {
            System.out.println(student+" ");
        }
        System.out.println();





        // Creating another List Reference Type variable and initializing it as an Object of ArrayList of Student type.
        List<Student> newStudList = new ArrayList<>();

        newStudList.add(new Student("Ravi Roy", 21));
        newStudList.add(new Student("Rahul Gupta", 22));
        newStudList.add(new Student("Akash Kanrar", 19));
        newStudList.add(new Student("Soham Chakraborty", 20));
        newStudList.add(new Student("Parth Sarathi", 20));

        System.out.println("\nNew student list before sorting:");
        for (Student student: newStudList) {
            System.out.println(student);
        }
        System.out.println();

        // We know that Comparator is a functional interface, which means that it has got only one abstract method which is the .compare() one. As a result we can use a short hand lamda expression to implement this interface as well. 
        // Creating a Lamda Expression to implement the Comparator interface
        Comparator<Student> lamdaCom = (i, j) -> i.age>j.age?1:-1;
        
        // Calling the .sort() static method by passing the lamda implementation of the Comparator functional interface. 
        Collections.sort(newStudList, lamdaCom);

        System.out.println("New student list after sorting: ");
        for(Student newStudent: newStudList){
            System.out.println(newStudent);
        }
        System.out.println();
    }
}
