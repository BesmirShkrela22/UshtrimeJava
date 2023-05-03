package Objects.Ushtrimi5;

import java.util.ArrayList;

/*5. Write a Java program to create a class called "Book" with attributes for title, author,
        and ISBN, and methods to add and remove books from a collection.*/
public class main {
    public static void main(String[] args) {

        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        Book.add_Book(book1);
        Book.add_Book(book2);
        ArrayList< Book > bookCollection = Book.get_BookCollection();
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }
        Book.remove_Book(book1);
        System.out.println("\nAfter removing " + book1.get_Title() + ":");
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }
    }

        
    }





