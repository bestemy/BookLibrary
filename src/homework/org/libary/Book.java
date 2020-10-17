package homework.org.libary;

public class Book {

    String title;
    String author;
    int noOfPages;

    public String getGenre() {
        return genre;
    }

    String genre;
//    float rate;
    float price;

    public Book(String title, String author, int noOfPages, String genre, float price) {
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
//        this.rate = rate;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", noOfPages=" + noOfPages +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
