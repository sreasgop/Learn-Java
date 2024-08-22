//    Question: Create a class Library that contains a collection of Book objects. Demonstrate aggregation by allowing books to exist independently of the library. Then, modify the example to show composition by creating a class Page within Book, where the pages cannot exist independently of the book.
//    Focus: Differentiating between aggregation and composition relationships.

import java.util.ArrayList;
import java.util.List;

class Page {
    private int pageNumber;
    private String content;

    // Private constructor to enforce composition
    private Page(int pageNumber, String content) {
        this.pageNumber = pageNumber;
        this.content = content;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public String getContent() {
        return this.content;
    }

    // Only the Book class can create Page objects
    static Page createPage(int pageNumber, String content) {
        return new Page(pageNumber, content);
    }
}

class Book {

    private String title;
    private String author;
    private String genre;
    private List<Page> pages;

    // Constructors
    public Book() {
    };

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = new ArrayList<>();
    }

    // Setter Methods:
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setgenre(String genre) {
        this.genre = genre;
    }

    public void addPage(int pageNumber, String content) {
        pages.add(Page.createPage(pageNumber, content));
    }

    // Getter Methods:
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }

    public void showPages() {
        for (Page page : pages) {
            System.out.println("Page " + page.getPageNumber() + ": " + page.getContent());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "\nBook [ title = " + title + ", author = " + author + ", genre = " + genre + " ]";
    }

}

class Library {

    private String name;
    private List<Book> bookList;

    public Library() {
    };

    public Library(String name) {
        this.name = name;
        bookList = new ArrayList<>();
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book newBook) {
        bookList.add(newBook);
    }

    // Getter Methods:
    public String getName() {
        return this.name;
    }

    public void showBooks() {
        for (Book i : bookList) {
            System.out.print(
                    "\nTitle: " + i.getTitle() + "\nAuthor: " + i.getAuthor() + "\nGenre: " + i.getGenre() + "\n");
        }
    }

}

public class Q12_AggregationAndComposition {
    public static void main(String[] args) {

        // Creating Objects of Book Class
        Book bk1 = new Book("Sapiens", "Yuval Noah Harari", "History");
        Book bk2 = new Book("Verity", "Collen Hoover", "Psychological Thriller");
        Book bk3 = new Book("It ends with us", "Collen Hoover", "Romance");
        Book bk4 = new Book("It starts with us", "Collen Hoover", "Romance");

        // Adding pages to the Books:
        bk1.addPage(3,
                "About 13.5 billion years ago, matter, energy, time and space came into being in what is known as the Big Bang. The story of these fundamental forces of our universe is called physics.");
        bk1.addPage(4,
                "There were humans long before there was history. Animals much like modern humans first appeared about 2.5 million years ago. But for countless generations they didnot stand out from the myriad other organisms with which they shared their habitats.");

        // Printing bk1 object of the Book Class:
        System.out.println(bk1);
        bk1.showPages(); // Using the .showPages() method of the Book class to access the attributes of
                         // Pages class.

        // Creating a library out of the objects of Book class:
        Library newobj = new Library("CSGS' Library");

        // Adding the Book objects to the Library object using the .addBook() method of
        // the Library class.
        newobj.addBook(bk1);
        newobj.addBook(bk2);
        newobj.addBook(bk3);
        newobj.addBook(bk4);

        // Using .showBooks() method of the Library Class to display the books available
        // in the library:
        newobj.showBooks();
    }
}
