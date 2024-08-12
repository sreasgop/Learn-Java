// Question: Create a class Book with properties like title, author, price, and ISBN. Write methods to set and get the values of these properties. Create an object of this class and set the values using the methods.
// Focus: Basic class creation, object instantiation, and encapsulation.

import java.util.Random;

class Book{
    
    private static int bookCount;
    private static Random random = new Random();

    // Private attributes:
    private String title; 
    private String author; 
    private float price; 
    private final String ISBN;


    // Constructors:
    public Book(){
        this.ISBN = genRandStr(4) + "-" + random.nextInt(999);
        bookCount++;
    }

    public Book(String title, String author, float price){
        this();
        this.title = title; 
        this.author = author; 
        this.price = price;
    }



    // Setter Methods:
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPrice(float price) {
        this.price = price;
    } 



    // Getter Methods:
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public float getPrice(){
        return this.price;
    }
    
    public String getISBN(){
        return this.ISBN;
    }
    
    public static int getBookCount(){
        return bookCount;
    }



    @Override
    public String toString() {
        return "Book \n[ title = " + title + "]\n[ author = " + author + "]\n[ price = " + price + "]\n[ ISBN = " + ISBN + "]\n";
    }



    // Function to generate String of random characters: 
    private static String genRandStr(int NoOfChar){
        char[] randStr = new char[NoOfChar]; 
        for (int i = 0; i < NoOfChar; i++) {
            randStr[i] = (char) (random.nextInt(26)+'A');
        }
        String result = new String(randStr);
        return result;
    }

}

public class Q1_ClassAndObjects {
    public static void main(String[] args) {
        
        // Creating a book object by directly passing the title of the book, name of author and price of the book in the parameter of the constructor. 
        Book bookObj1 = new Book("Computer Fundamentals in C", "Reema Thareja", 450);
        // Printing the first book object:
        System.out.println(bookObj1);
        

        // Creating another object of Book class using it's default non-parameterized constructor 
        Book bookObj2 = new Book();
        // Using the setter methods to set title, author's name and price to bookObj2:
        bookObj2.setTitle("Sapiens");
        bookObj2.setAuthor("Yuval Noah Harari");
        bookObj2.setPrice(675);
        // Printing bookObj2:
        System.out.println(bookObj2);


        // Using the getter methods to retreive values:
        System.out.println("Author of 2nd Book: " + bookObj2.getAuthor());
        System.out.println("Price of 1st Book: " + bookObj1.getPrice());
        System.out.println("Available Books: " + Book.getBookCount());
    }
}
