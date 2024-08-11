// The String class is found in java.lang.String, which doesn't need to be explicitly called in a java program. The String class implements Serializeable, Comparable and CharSqeuence interfaces. 
// String is an object that represents a sequence of char values. An Array of characters works same as a string in Java. Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.
// The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. For mutable strings, you can use StringBuffer and StringBuilder class

public class String01 {
    public static void main(String[] args) {
        

        // There are two ways to create String object:
        // By string literal
        // By new keyword


        // The method you use determines how the string is stored in memory:

        // String Literal:
        // Example: String s1 = "Hello";
        // Memory: The string is stored in the String Pool, a special memory region. If a string with the same content already exists in the pool, no new object is created, and the reference to the existing string is returned.
        // Efficiency: More memory efficient because it avoids creating duplicate strings.
        
        // String Object using new Keyword:
        // Example: String s2 = new String("Hello");
        // Memory: A new String object is created on the heap every time, regardless of whether the same content exists in the String Pool.
        // Efficiency: Less memory efficient as it always creates a new object.

        // Key Difference:
        // String literals reuse existing objects, while using new always creates a new object.


        // The System.identityHashCode() method returns a hash code based on the object's memory address unlike the .hashCode() method of the String class which returns a hash code based on the Object's data. The System.itentityHashCode() method cannot be overriddenm ensuring each object's identity is preserved. Hence, System.identityHashCode() is useful when we need to differentiate between objects even if .hashCode() returns the same value because the Object's value is the same.

        // In simple words, System.identityHashCode() helps us figure out an Object's memory address and .hashCode() method helps us figure out memory addres of an object's data. 




        // USING STRING LITERAL: 
        // Java String literal is created by using double quotes.
        // Each time we create a new string literal, the JVM checks the "String constant pool" first and if the string literal already exists in the pool, a reference to the pooled instance is returned. If the string literal doesn't exist in the string consstant pool, a new string instance is created and placed in the string constant pool. 

        String str1 = "Sreas";
        String str2 = "Sreas";  // It doesn't create a new instance rather creates a reference to the already existing string literal "Sreas" in the string constant pool.

        // Using System.identityHashCode() returns the memory address of an Object:
        // And here we will be able to see that both str1 and str2 has the same memory address, as we used the same string literal to create str2.
        System.out.println("Memory Address of str1 Object: " + System.identityHashCode(str1));
        System.out.println("Memory Address of str2 Object: "+ System.identityHashCode(str2));




        // USING NEW KEYWORD:
        // JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. The variables will refer to the object in a heap (non-pool).

        String str3 = new String("Sreas");

        // Using System.identityHashCode() returns the memory address of an Object and in this case we can see that inspite of all three objects holding the same string literal, str3 has a different memory address allocated to it because str3 was creating using the new keyword.
        System.out.println("Memory Address of str3 Object: " + System.identityHashCode(str3));




        // However, all str1, str2 and str3 points to the same data from the String Constant Pool. Therefore, even when we created str3 using the new keyword, which creates a new object in the heap, the string data itself may still refer to the same sequence of characters that exists in the String Constant Pool. We can prove that using the .hashCode() method of the String class. As all three has the same value, three will return the same hashCode as well proving all at pointing at the same string literal in the string constant pool.
        System.out.println("Memory Address of the String literal of str1: " + str1.hashCode());
        System.out.println("Memory Address of the String literal of str2: " + str2.hashCode());
        System.out.println("Memory Address of the String literal of str3: " + str3.hashCode());
        
        
        // An array of characters:
        char[] charArr = {'S','r', 'e', 'a', 's'};
        
        // A string made from a sequence of characters:
        String str4 = new String(charArr);
        // Note: As str4 has been created using the new keyword it's supposed to be a new Object in the heap memory with separate memory address, however as it too has the same string literal if we print the .hashCode() we will be able to see this Object points to the same data from the String constant pool as well. 

        System.out.println(str4);


    }
}
