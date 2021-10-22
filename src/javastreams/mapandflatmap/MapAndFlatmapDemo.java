package javastreams.mapandflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndFlatmapDemo {
    public static void main(String[] args){
        //using of MAP
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("movie 1",44));
        movieList.add(new Movie("movie 2",55));
        movieList.add(new Movie("movie 3",66));

        movieList.stream()
                .map(movie -> movie.getTitle())  //getting only the TITLE from the Movie List
                .forEach(x-> System.out.println(x));

        movieList.stream()
                .mapToInt(movie -> movie.getLike())//getting only the LIKE from the Movie List
                .forEach(x-> System.out.println(x));


       //Using of the FlatMAP
       // we can use FlatMap to convert Stream<List<OBJECT>> to Stream<OBJECT>
       // Flatmap takes a function of list of Integers and Returns a Stream
        System.out.println("with FLATMAP");
        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        listStream.flatMap(list -> list.stream())
                .forEach(list -> System.out.println(list));

    }
}
