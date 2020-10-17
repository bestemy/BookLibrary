package homework.org;

import homework.org.libary.Book;
import homework.org.libary.Library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        int chose;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1-> insert a book in the library");
            System.out.println("2-> search books by a genre");
            System.out.println("3-> search books by a title");
            System.out.println("4-> print books");

            chose = scanner.nextInt();
            scanner.nextLine();

            switch (chose) {
                case 1:
                    // insert book
                    String title;
                    String author;
                    String genre;
                    int noOfPages;
                    float price;

                    System.out.println("Add book (title, author, noOfPages, genre, price)");
                    System.out.println("Title: ");
                    title = scanner.nextLine();
                    System.out.println("Author: ");
                    author = scanner.nextLine();
                    System.out.println("NoOfPages: ");
                    noOfPages = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Genre: ");
                    genre = scanner.nextLine();
                    System.out.println("Price: ");
                    price = scanner.nextFloat();
                    scanner.nextLine();
                    Book book = new Book(title, author, noOfPages, genre, price);
                    library.addBook(book);
                    break;
                case 2:
                    //search by genre
                    break;
                case 3:
                    //search by title
                    break;
                case 4:
                    //print
                    System.out.println(library.toString());
                    break;
            }
        }


        // write your code here
    }
}
