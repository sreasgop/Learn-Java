// Question: Create a class Book with properties like title, author, price, and ISBN. Write methods to set and get the values of these properties. Create an object of this class and set the values using the methods.
// Focus: Basic class creation, object instantiation, and encapsulation.

import java.util.Random;

class Book{
    
    private static int bookCount;

    // Private attributes:
    private String title; 
    private String author; 
    private float price; 
    private final String ISBN;


    // Constructor:
    public Book(String title, String author, float price){
        this.title = title; 
        this.author = author; 
        this.price = price;
        this.ISBN = ""+(char)(Math.random()*100)+(int)(Math.random()*1001);
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
    
    public int getBookCount(){
        return bookCount;
    }



    @Override
    public String toString() {
        return "Book \n[ title = " + title + "]\n[ author = " + author + "]\n[ price = " + price + "]\n[ ISBN = " + ISBN + "]\n";
    }

}

public class Q1_ClassAndObjects {
    public static void main(String[] args) {
        
        Book bookObj1 = new Book("Computer Fundamentals in C", "Reema Thareja", 450);

        System.out.println(bookObj1);

    }
}
