import java.util.Collections; 
import java.util.List; 
import java.util.ArrayList;
import java.lang.Comparable;

class Student implements Comparable<Student>{

    String name; 
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    } 


    @Override
    public int compareTo(Student that){
        if(this.age>that.age){
            return 1;       // return 1 means swap takes place, here we swap if the age of the calling element is greater than the next element of the collection.
        } else {
            return -1;      // return -1 means swap doesn't take place.
        }
    }
    
}

public class OOP_41_CollectionSortClass2 {
    public static void main(String[] args) {
        
        // Let's create a ArrayList of elements of Student type Objects.
        List<Student> studarr = new ArrayList<>();

        // Populating the ArrayList of Student type with Student elements.
        studarr.add(new Student("Chandra Sreas Gop", 19));
        studarr.add(new Student("Soutrika Das", 18));
        studarr.add(new Student("Ayush Kumar Shaw", 21));
        studarr.add(new Student("Sanjib Kumar Sah", 20));
        studarr.add(new Student("Khushi Kumari", 20));
        studarr.add(new Student("Sayane Gop", 15));

        // As in the Student class we have implemented the Comparable functional interface, and we have overridden the .compareTo() method we can now simply use the .sort() method of Collections framework on the ArrayList of Student. 
        Collections.sort(studarr);

        System.out.println("\nSorted ArrayList of Student type on the basis of age: ");
        for(Student s: studarr){
            System.out.println(s);
        }
    }
}
