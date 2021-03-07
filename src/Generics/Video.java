package Generics;

import Books.Authors;

import java.time.LocalDate;

public class Video implements Media {

    private String title;
    private Authors author;
    private LocalDate date;
    private double rating;
    private double views;

    public Video(String title, Authors author, LocalDate date, double rating, double views) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.rating = rating;
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public Authors getAuthor() {
        return author;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getRating() {
        return rating;
    }

    public double getViews() {
        return views;
    }
}
