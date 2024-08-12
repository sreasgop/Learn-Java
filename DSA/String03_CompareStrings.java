// We can compare srings in java on the basis of content (String literal) and reference variables. 

// There are three ways to compare strings in java:
// 1. By using equals() method.
    // .equals() method of the String class compares the string literal of the current reference variable with the string literal of the reference variable passed in the parameter of the method. It is case sensitive while checking, which means it differentiates between lowercase characters and uppercase charaters. 

    // .equalsIgnoreCase() method of the String class works in the same way as the .equals() method, except for the fact that this method is not case sensitive while checking. 

// 2. By using == Operator:
    // The == operator compares references and not the values or contents. In other words, == operator checks if two strings are the same objects or are two different objects in the heap memory. It dosn't care about the values. As in some cases two different objects can also have the same string literal content stored to them as we know in java String values are set after checking the string constant pool, if the literal exists there the new object will simply get a reference to it. 

// 3. By using compareTo() method. 
    // The String class compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.

    // Suppose s1 and s2 are two String objects. If:

    // s1 == s2 : The method returns 0.
    // s1 > s2 : The method returns a positive value.
    // s1 < s2 : The method returns a negative value.



public class String03_CompareStrings {
    public static void main(String[] args) {
        
        // By using equals() method:
        String str1 = new String("Sreas");
        String str2 = new String("Sreas");
        String str3 = new String("sreas");

        System.out.println("Is the content of str1 and str2 same: "+  str1.equals(str2));

        // Comparing str1 and str3 is going to return  'false' because the case of isn't same. str3 contains 'sreas' in all lower case.
        System.out.println(str1.equals(str3));

        // If we want to check the contents without differentiating between lowercase and uppercase we can use the .equalsIgnoreCase() method of the String class.
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println();




        // By Using == operator:
        String str4 = "Shikhor";
        String str5 = new String("Shikhor");
        String str6 = "Shikhor";

        // We can see that str4 and str5 string reference variables has the same content, or in other words the same string literal, but checking them with the equality operator will give a false as both of them are separate string objects as str5 referene variable was creating using 'new' keyword which created a new String object in the heap memory with got referenced to the "Shikhor" literal which was already available in the String constant pool. 
        System.out.println(str4==str5);

        // However, we can see that comparing str4 with str6 reference variable will return true, as both of them were creating using the "Shikhor" string literal and as a result the latter object str6 doesn't actually exist as a separate object in the heap memory rather refers the str4 object.
        System.out.println(str4==str6);
        System.out.println();




        // By using compareTo() method:
        String str7 = "Chandra";
        String str8 = new String("Chadnik");
        String str9 = new String("Bipasha");

        System.out.println(str7.compareTo(str8));   // str7==str8, 0
        System.out.println(str7.compareTo(str9));   // str7 > str9, +ve
        System.out.println(str9.compareTo(str7));   // str7 > str9, -ve

        // the .compareTo() method returns either 0, positive integer value or negative integer value based on the string that we are calling the method with and the string literal we are passing as parameters. 
    }

}
