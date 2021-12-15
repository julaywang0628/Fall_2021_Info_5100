package com.Northeastern.Zhilei;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Movie {
    String title;
    Date releaseDate;
    List<String> actors;
    String director;

    public Movie(String title, GregorianCalendar date, List<String> actors, String director) {
        this.title = title;
        this.releaseDate = date.getTime();
        this.actors = actors;
        this.director = director;
    }

}
