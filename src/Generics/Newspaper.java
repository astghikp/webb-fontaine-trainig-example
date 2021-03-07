package Generics;

import java.time.LocalDate;

public class Newspaper implements Media {

    private String name;
    private String country;
    private LocalDate date;
    private double cost;

    public Newspaper(String name, String country, LocalDate date, double cost) {
        this.name = name;
        this.country = country;
        this.date = date;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getCost() {
        return cost;
    }
}
