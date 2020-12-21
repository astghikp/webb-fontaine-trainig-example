package Books;

import java.time.LocalDate;


public class Books {
    private String title;
    private Authors author;
    private LocalDate date;
    private String genre;
    private double rating;
    private double cost;

    public Books(String title, Authors author, LocalDate date, String genre, double rating, double cost) {
        setTitle(title);
        setAuthor(author);
        setDate(date);
        setGenre(genre);
        setRating(rating);
        setCost(cost);
    }

    public Books(Books book) {
        setTitle(book.getTitle());
        setAuthor(book.getAuthor());
        setDate(book.getDate());
        setGenre(book.getGenre());
        setRating(book.getRating());
        setCost(book.getCost());

    }

    public Books() {

    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public Authors getAuthor() {
        return author;
    }

    private void setAuthor(Authors author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    private void setDate(LocalDate date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    private void setRating(double rating) {
        this.rating = rating;
    }

    public double getCost() {
        return cost;
    }

    private void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book title is" + title + ", author is:" + author + ", date is:" + date + ", genre is:" + genre + ", rating is:" + rating + ", cost is:" + cost;
    }
}
