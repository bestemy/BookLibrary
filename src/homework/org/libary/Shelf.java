package homework.org.libary;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    String genre;
    List<Book> books;

    public Shelf(String genre) {
        this.genre = genre;
        this.books = new ArrayList<>();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }


    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "\n" + "Shelf{" +
                "genre='" + genre + '\'' +
                ", books=" + books +
                '}';
    }
}
