// Strings objects are immutable in Java, which simply means that once string objects are unmodifiable or unchangeable. Once a string object is created it's data or state can't be changed but a new string object is created. 

// Why are String Objects immutable in Java?
// Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sreas". If one reference variable changes the value of the object, it will be affect by all the reference variables and also all the reference variables will be able to change the value of the oher reference variables indirectly. That is why String objects are immutable in Java.

public class String02_Immutable {
    public static void main(String[] args) {
        
        // Let's demonstrate that strings are immutable by this example:
        String str1 = new String("Sreas");

        // Let's concatenate this string with the last name:
        System.out.println(str1.concat(" Gop"));

        // Let's try printing str1 after concatenation than:
        System.out.println(str1);       // This will string print the same value that it had before concatenation. That is becuse "Sreas" is not changed when we concatenate, but a new String Literal is created with "Sreas Gop" value in the String constant pool. That's why String is known as immutable. 


        // However, we can explicitly assign the concatenated String literal to the reference variable str1, then it will refer to "Sreas Gop" String literal. 
        str1 = str1.concat(" Gop");
        System.out.println(str1);
        // We should keep in mind that the "Sreas" literal has not been modified and still exists in the String Constant pool as it is and the literal "Sreas Gop" exists as a different entity, it's just that we have explicitly assigned our reference variable str1 to refer to the later string literal "Sreas Gop".
    }
}
