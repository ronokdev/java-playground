package javastreams.streamslicing;

import javastreams.mapandflatmap.Movie;

import java.util.ArrayList;
import java.util.List;

public class StreamSlicingDemo {
    public static void main(String[] args){
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("movie 1",44));
        movieList.add(new Movie("movie 2",55));
        movieList.add(new Movie("movie 3",66));
        movieList.add(new Movie("movie 4",76));
        movieList.add(new Movie("movie 5",86));
        movieList.add(new Movie("movie 6",96));

        //Skipping 3 movies and getting the next 2 movies with Skip and Limit
        movieList.stream()
                .skip(3)
                .limit(2)
                .map(movie -> movie.getTitle())
                .forEach(x-> System.out.println(x));
    }
}
