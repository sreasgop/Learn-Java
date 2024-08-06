import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.Attributes.Name;

public class OOP_35_Map{
    public static void main(String[] args){

        Map<String, Integer> students = new HashMap<>();

        students.put("Chandra Sreas Gop", 100);
        students.put("Soutrika Das", 98);
        students.put("Sanjib Kumar Sah", 60);
        students.put("Ayush Kumar Sah", 80);

        System.out.println(students);

        // .get() method takes the key as a parameter and prints the value as an output
        System.out.println("Marks of Chandra Sreas Gop: " + students.get("Chandra Sreas Gop"));
        
        // .keyset() method prints all the available keys in the map.
        System.out.println("\n\n"+students.keySet());

        // .values() method prints all the available values int the map.
        System.out.println("\n\n"+students.values());


        // We can use the .entrySet() method to access the keys and values using an enhanced for loop.
        System.out.println("\n\nAccessing values using .entrySet() and enhanced for loop:");
        for(Entry<String, Integer> marks: students.entrySet()){
            System.out.println(marks);
        }


        // We can use the .keyset() method to access all the keys using an enhanced for loop.
        System.out.println("\n\nAccessing values using .keySet() and enhanced for loop:");
        for(String name: students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }

    }
}