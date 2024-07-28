public class String1 {
    public static void main(String[] args) {
        
        String name = new String("Chandra Sreas Gop");

        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(0));     // Gives the character available at the mentioned index. 
        System.out.println(name.concat(" Shikhor"));
        System.out.println(name.toLowerCase());


        // STRINGBUFFER: 

        // StringBuffer gives us a mutable string. StringBuffer is thread safe. 

        // A thread-safe, mutable sequence of characters. A string buffer is like a String, but can be modified. At any point in time it contains some particular sequence of characters, but the length and content of the sequence can be changed through certain method calls.

        // String buffers are safe for use by multiple threads. The methods are synchronized where necessary so that all the operations on any particular instance behave as if they occur in some serial order that is consistent with the order of the method calls made by each of the individual threads involved. The principal operations on a StringBuffer are the append and insert methods, which are overloaded so as to accept data of any type. Each effectively converts a given datum to a string and then appends or inserts the characters of that data to the StringBuffer.

        StringBuffer sb = new StringBuffer("Soutrika");
        sb.append(" Das");      // This will change the value of the string literal assigned to sb unlike the .concat which temporarily changes.
        sb.deleteCharAt(2);
        sb.insert(sb.length(), " Gop");     // Helps us insert a sequence of characters at any index we want to.
        System.out.println(sb);

        String str = sb.toString();     // This method of the StringBuffer reference type helps us convert from StringBuffer to string type.
        System.out.println(str.getClass().getSimpleName());
        
        
        // STRINGBUILDER
        // String builder is not thread safe.

    }   
}
