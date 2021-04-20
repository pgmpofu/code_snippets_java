/**
 * @author Patience Mpofu
 * @date 04/20/2021
 */
package assignments.two;

public class Book {
    private String isbn;
    private String title;
    private String yearPublished;
    private String author;
    private String genre;
    private int edition;
    private String publisher;

    public Book(){ }

    public Book(String isbn, String title, String yearPublished, String author, String genre, int edition, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
        this.genre = genre;
        this.edition = edition;
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
