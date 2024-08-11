// The String class is found in java.lang.String, which doesn't need to be explicitly called in a java program. The String class implements Serializeable, Comparable and CharSqeuence interfaces. 
// String is an object that represents a sequence of char values. An Array of characters works same as a string in Java. Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.
// The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. For mutable strings, you can use StringBuffer and StringBuilder class

public class String01 {
    public static void main(String[] args) {
        

        // There are two ways to create String object:
        // By string literal
        // By new keyword

        // By string literal: 
        // Java String literal is created by using double quotes.
        // Each time we create a new string literal, the JVM checks the "String constant pool" first and if the string literal already exists in the pool, a reference to the pooled instance is returned. If the string literal doesn't exist in the string consstant pool, a new string instance is created and placed in the string constant pool. 

        // This point is proven if we try to create two strings using String literal and then print their hashCode() we will see that inspite of being assigned to separate reference variable both of theem have the same memory address. 
        String str1 = "Sreas";
        String str2 = "Sreas";  // It doesn't create a new instance rather creates a reference to the already existing string literal "Sreas" in the string constant pool.
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());


        // An array of characters:
        char[] charArr = {'T','e', 'c', 'h', 'n', 'o'};

        // A string made from a sequence of characters:
        String str = new String(charArr);

        System.out.println(str);


    }
}
