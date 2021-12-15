package com.Northeastern.Zhilei;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //Add List of movies based on the classes created above.
        Netflix netflix = new Netflix("Netflix");

        Genre science = new Genre("science");

        netflix.addGenre(science);

        GregorianCalendar date1 =  new GregorianCalendar(2009, 9, 1);
        Movie HarryPotter = new Movie("Harry Potter", date1, Arrays.asList(new String[]{"Harry, Roen"}), "J.K.Rowling" );

        GregorianCalendar date2 =  new GregorianCalendar(1999, 10, 5);
        Movie Secret = new Movie("Scary Secret", date2, Arrays.asList(new String[]{"Susan"}), "Joanna");

        GregorianCalendar date3 =  new GregorianCalendar(1994, 06, 24);
        Movie Computer = new Movie("The Story of Computer", date3, Arrays.asList(new String[]{"Joe, Susie"}), "Julay");

        GregorianCalendar date4 =  new GregorianCalendar(2016, 11, 12);
        Movie Stranger = new Movie("Dr.Stranger", date4, Arrays.asList(new String[]{"Fort, Waltson"}), "Marvel");

        GregorianCalendar date5 =  new GregorianCalendar(2021, 3, 4);
        Movie SpiderWoman = new Movie("Spyder Woman", date5, Arrays.asList(new String[]{"Susan, Fort"}), "Not Marvel");

        science.getMovies().add(HarryPotter);
        science.getMovies().add(Secret);
        science.getMovies().add(Computer);
        science.getMovies().add(Stranger);
        science.getMovies().add(SpiderWoman);

        //for all movies released before 2000, add the string "(Classic)" to the title of the movie using
        //flatMap.
        System.out.println("-----add Classic-----");
        addClassic(netflix);

        //Get the latest 3 movies released using .limit() method of stream.
        System.out.println("-----get latest 3 movies-----");
        for(Movie movie : getLatest(netflix)) {
            System.out.println(movie.title);
        }

        //Create a predicate for release date before 2000 and a predicate for release date before 1990
        //and then Chain the predicates for finding movies between 1990 and 2000.
        IntPredicate before2000 = i -> i<2000;
        IntPredicate after1990 = i -> i>1990;

        System.out.println();
        System.out.println("-----predicate between 1990 and 2000-----");
        List<Movie> yearChain = netflix.genres.stream().flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> before2000.and(after1990).test(Integer.parseInt(new SimpleDateFormat("yyyy").format(movie.releaseDate))))
                .collect(Collectors.toList());

        for(Movie movie : yearChain) {
            System.out.println(movie.title);
        }

        //Write a method which that will add release year in the title of the movie and return the title and
        //then use this method for all the movies.
        System.out.println();
        System.out.println("-----add release year-----");
        addReleaseYear(netflix);

        //Sorting on one of the feature(Ex: Released year or title) which will use comparator.
        System.out.println();
        System.out.println("-----sort by year-----");
        List<Movie> sortYear = netflix.genres.stream().flatMap(genre -> genre.getMovies().stream())
                .collect(Collectors.toList());

        sortYear.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.releaseDate.compareTo(o2.releaseDate);
            }
        });

        for(Movie movie : sortYear) {
            System.out.println(movie.title);
        }

    }

    public static void addClassic(Netflix netflix) {
        netflix.genres.stream().flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.releaseDate.before(new GregorianCalendar(2000, 1, 1).getTime()))
                .collect(Collectors.toList())
                .forEach(movie -> System.out.println(movie.title = "(Classic)" + movie.title) );

        System.out.println();
    }

    public static List<Movie> getLatest(Netflix netflix) {
        List<Movie> latest = netflix.genres.stream().flatMap(genre -> genre.getMovies().stream())
                .sorted((date1, date2) -> date2.releaseDate.compareTo(date1.releaseDate))
                .limit(3)
                .collect(Collectors.toList());
        return latest;
    }

    public static void addReleaseYear(Netflix netflix) {
        netflix.genres.stream()
                .flatMap(genre -> genre.getMovies().stream())
                .collect(Collectors.toList())
                .forEach(movie -> System.out.println(movie.title = new SimpleDateFormat("yyyy").format(movie.releaseDate) + " " + movie.title));


    }
}
