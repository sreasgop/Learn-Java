// A Comparator is an interface using which we can specify our own logic for sorting. 

import java.util.List; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OOP_38_CollectionSortComparator {
    public static void main(String[] args) {

        // As we know that Comparator is an Interface and we cannot create an object of an interface so in order to implement it we are creating an anonymous class of the Comparator Interface. 
        // In terms of an Anonymous Class we are required to mention the data type in the right hand side as well. 

        // This particular comparator helps us sort on the basis of the last element. 
        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j){   // We know that collections work with Wrapper Classes as a result we needed to mention Integer type elements here as well.
                if(i%10 > j%10){
                    return 1;   // return 1 means it will swap. 
                } else {
                    return -1;  // return -1 means it will not swap.
                }
            }
        };

        List<Integer> listobj = new ArrayList<>();
        listobj.add(19);
        listobj.add(27);
        listobj.add(32);
        listobj.add(34);
        listobj.add(10);
        listobj.add(00);
        listobj.add(93);
        listobj.add(20);
        listobj.add(45);
        listobj.add(11);

        // Simply sorting using the .sort() method of the Collections Class
        Collections.sort(listobj);
        System.out.println(listobj);

        // The .sort() method also allows us to sort on the basis of a Comparator and we can pass it in the method itself. 
        Collections.sort(listobj, com);
        System.out.println(listobj);
    }
}
