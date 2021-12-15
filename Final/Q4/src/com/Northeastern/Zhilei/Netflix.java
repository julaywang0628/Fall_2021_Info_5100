package com.Northeastern.Zhilei;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Netflix {
    List<Genre> genres;

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public void addGenre(Genre genre) {
        this.genres.add(genre);
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Netflix(String name ){
        this.name = name;
        this.genres = new ArrayList<>();
    }
    public Genre getGenre(String genreName){
        ArrayList<Genre> filter = (ArrayList<Genre>) genres.stream()
                .filter(section -> section.getName().equalsIgnoreCase(genreName))
                .collect(Collectors.toList());
        if(filter.size() == 0){
            return null;
        }
        return filter.get(0);
    }
}
