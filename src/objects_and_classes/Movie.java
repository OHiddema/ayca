package objects_and_classes;

import java.util.ArrayList;

/*
 * File: Movie.java
 * ------------------------------
 * Creates a Movie object with name,year,rating and cast members. Enables user to get cast info. and review about the film.
 */

public class Movie {

    private String movieName;
    private String year;
    private double rating;
    private ArrayList<String> cast;

    public Movie(String movieName, String year, double rating, ArrayList<String> cast) {
        this.movieName = movieName;
        this.year = year;
        this.rating = rating;
        this.cast = cast;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public String getReview() {
        if (rating > 10) return "N/A";
        if (rating >= 9) return "Excellent";
        if (rating >= 7) return "Good";
        if (rating >= 5) return "Average";
        if (rating >= 3) return "Below Average";
        if (rating >= 0) return "Poor";
        return "N/A";
    }

    public boolean inCast(String castName) {
        return cast.contains(castName);
    }

}