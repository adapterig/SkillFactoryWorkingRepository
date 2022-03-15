package BookingStore;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[10];

        Book book1 = new Book();
        book1.name = "The Hobbit";
        book1.price = 999;
        book1.year = 1937;
        addBook(book1, books);

        book1.name = "The Fobbit";
        book1.price = 9929;
        book1.year = 1977;
        addBook(book1, books);

        Book book2 = new Book();
        book2.name = "The Hobbit1";
        book2.price = 999;
        book2.year = 1937;
        addBook(book2, books);

        Book book3 = new Book();
        book3.name = "The Hobbit2";
        book3.price = 999;
        book3.year = 1927;
        addBook(book3, books);

        Book book4 = new Book();
        book4.name = "The Hobb3t1";
        book4.price = 349;
        book4.year = 1957;
        addBook(book4, books);

        Book book5 = new Book();
        book5.name = "The Hobbit1";
        book5.price = 999;
        book5.year = 1937;
        addBook(book5, books);
        System.out.println(books.length);
        printBooks(books);
    }

    private static void addBook(Book book, Book[] books) {
        boolean is = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && book.name.equals(books[i].name) && book.year == books[i].year) {
                is = true;
                break;
            }
        }
        if (is) {
            System.out.println("Книга есть в картотеке");
        } else {
            System.out.println("Книги нет в картотеке, добавляем.");
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    System.out.println("Книга добавлена");
                    break;
                }
            }
        }
        return;
    }

    private static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.printf("Книга №%s: название: \"%s\", год издания: %sг., цена - %s USD\n", i + 1, books[i].name, books[i].year, books[i].price);
            }
        }
    }
}