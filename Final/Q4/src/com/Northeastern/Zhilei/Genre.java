package com.Northeastern.Zhilei;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    String name;
    List<Movie> movies;

    public Genre(String name) {
        this.name = name;
        this.movies = new ArrayList<Movie>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

}
