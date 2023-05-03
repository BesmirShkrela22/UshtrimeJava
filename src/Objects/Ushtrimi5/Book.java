package Objects.Ushtrimi5;

import java.util.ArrayList;

/*5. Write a Java program to create a class called "Book" with attributes for title,
        author, and ISBN, and methods to add and remove books from a collection.*/
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList < Book > bookCollection = new ArrayList < Book > ();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String get_Title() {
        return title;
    }

    public void set_Title(String title) {
        this.title = title;
    }

    public String get_Author() {
        return author;
    }

    public void set_Author(String author) {
        this.author = author;
    }

    public String get_ISBN() {
        return ISBN;
    }

    public void set_ISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void add_Book(Book book) {
        bookCollection.add(book);
    }

    public static void remove_Book(Book book) {
        bookCollection.remove(book);
    }

    public static ArrayList < Book > get_BookCollection() {
        return bookCollection;
    }
    }

