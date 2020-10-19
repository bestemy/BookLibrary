package homework.org.libary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    List<Shelf> shelves;

    public Library() {
        this.shelves = new ArrayList<>();
    }

    public void addBook(Book book) {
        String bookGenre = book.getGenre();

        if (!isGenreExists(bookGenre)) {
            Shelf newGenreShelf = new Shelf(bookGenre);
            newGenreShelf.addBook(book);
            shelves.add(newGenreShelf);
            return;
        }

        for (Shelf shelf : shelves) {
            if (shelf.genre.equals(bookGenre)) {
                shelf.addBook(book);
            }
        }
    }

    public boolean deleteBookBtTitle(String title) {
        Book deletedBook = searchByTitle(title);
        Shelf shelf = getShelfByGenre(deletedBook.getGenre());

        if (shelf != null) {
            return shelf.getBooks().remove(deletedBook);
        }

        return false;
    }

    public Book searchByTitle(String title) {
        for (Shelf shelf : shelves) {
            for (Book book : shelf.getBooks()) {
                if (book.getTitle().equals(title)) {
                    return book;
                }
            }
        }

        return null;
    }

    public List<Book> searchByGenre(String genre) {
        Shelf shelf = getShelfByGenre(genre);
        if (shelf != null) return shelf.getBooks();

        return Collections.emptyList();
    }

    private Shelf getShelfByGenre(String genre) {
        for (Shelf shelf : shelves) {
            if (shelf.getGenre().equals(genre)) {
                return shelf;
            }
        }
        return null;
    }

    public List<Book> searchingByAuthor(String author) {
        List<Book> result = new ArrayList<>();

        for (Shelf shelf : shelves) {
            for (Book book : shelf.getBooks()) {
                if(book.getAuthor().equals(author)){
                    result.add(book);
                }
            }
        }

        return result;
    }

    private boolean isGenreExists(String genre) {
        Shelf shelf = getShelfByGenre(genre);
        return shelf != null;
    }

    public List<Shelf> getShelves() {
        return shelves;
    }

    public void setShelves(List<Shelf> shelves) {
        this.shelves = shelves;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Library: " + shelves.toString();
    }
}
