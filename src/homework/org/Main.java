package homework.org;

import homework.org.libary.Book;
import homework.org.libary.Library;

import java.awt.*;
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
            System.out.println("5-> delete a book by title");
            System.out.println("6-> search a book by author");
            System.out.println("7-> Edit Book");

            chose = scanner.nextInt();
            scanner.nextLine();

            // insert book
            //search by genre
            //search by title
            //print
            switch (chose) {
                case 1 -> {
                    insertBook(library, scanner);
                }
                case 2 -> {
                    searchingByGenre(library, scanner);
                }
                case 3 -> {
                    searchingByTitle(library, scanner);
                }
                case 4 -> System.out.println(library.toString());
                case 5 -> {
                    deletedByTitle(library, scanner);
                }
                case 6 ->{
                    //search books by author
                    searchingByAuthor(library, scanner);
                }
                case 7 ->{
                    editByAuthor(library, scanner);
                }
            }
        }

    }

    private static void deletedByTitle(Library library, Scanner scanner) {
        String bookTitle;
        System.out.println("Insert deleting book title:");
        bookTitle = scanner.nextLine();

        if(library.deleteBookBtTitle(bookTitle)){
            System.out.println("Book "+ bookTitle + "was successfully deleted");
        }else {
            System.out.println("Book "+ bookTitle + "was unsuccessfully deleted");
        }
    }

    private static void searchingByTitle(Library library, Scanner scanner) {
        String searchingTitle;
        System.out.println("Insert searching title: ");
        searchingTitle = scanner.nextLine();
        Book resultBook = library.searchByTitle(searchingTitle);
        if (resultBook == null) {
            System.out.println("The book does not exist!!");
        } else {
            System.out.println(resultBook);
        }
    }

    public static void editByTitle(library library, Scanner scanner) {
        String editByTitle;
        System.out.println("Enter the book");
    }

    private static void searchingByGenre(Library library, Scanner scanner) {
        String searchingGenre;
        System.out.println("Insert searching genre:");
        searchingGenre = scanner.nextLine();
        System.out.println(library.searchByGenre(searchingGenre));
    }

    public static void searchingByAuthor(Library library, Scanner scanner) {
        String searchingAuthor;
        System.out.println("Insert searching author:");
        searchingAuthor = scanner.nextLine();
        System.out.println(library.searchingByAuthor(searchingAuthor));

    }

    private static void insertBook(Library library, Scanner scanner) {
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
    }
}
