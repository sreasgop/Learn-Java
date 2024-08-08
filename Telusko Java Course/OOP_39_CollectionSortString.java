import java.util.Collections;
import java.util.List; 
import java.util.ArrayList;
import java.util.Comparator;

public class OOP_39_CollectionSortString {
    public static void main(String[] args) {

        // Creating a List Reference type with ArrayList Object of String.
        List<String> names = new ArrayList<>();

        names.add("Sreas");
        names.add("Soutrika Das");
        names.add("Sanjib");
        names.add("Ayush Kumar Shaw");
        names.add("Khushi");
        names.add("Swayambhu");


        // Uisng the .sort() method on an ArrayList() of strings by default sorts it ALphabetically. 
        Collections.sort(names);
        System.out.println(names);
        System.out.println();


        // Using the .sort() method along with a Comparator so that we get to sort the names according to their length. 

        // Creating a Comparator Anonymous Class: This comparator anonymous class will compare two adjacent names according to their lengths, and if the 
        Comparator<String> strcom = new Comparator<String>() {
            public int compare(String i, String j){
                if(i.length() > j.length()){
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        // Calling the method: 
        System.out.println("Sorting the Array of names on the basis of their length: ");
        Collections.sort(names, strcom);
        System.out.println(names);


    }
}
