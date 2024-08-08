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

        for (Student student : studs) {
            System.out.println(student+" ");
        }
        
        // I can't simply use the Collections.sort() static method to sort this ArrayList of Student data type. 
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


        Collections.sort(studs, com);

        
    }
}
