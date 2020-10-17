package homework.org.libary;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Shelf> shelves;

    public Library() {
        this.shelves = new ArrayList<>();
    }

    public void addBook(Book book) {
        String bookGenre = book.getGenre();

        if (shelves.isEmpty() || !isGenreExists(bookGenre)) {
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

    private boolean isGenreExists(String genre){
        for (Shelf shelf: shelves){
            if(shelf.getGenre().equals(genre)){
                return true;
            }
        }
        return false;
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
