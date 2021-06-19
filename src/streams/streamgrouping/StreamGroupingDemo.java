package streams.streamgrouping;

import streams.streamgrouping.Movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamGroupingDemo {
    public static void main(String[] args){
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Movie 1",8,MovieGenre.ACTION));
        movies.add(new Movies("Movie 2",9,MovieGenre.COMEDY));
        movies.add(new Movies("Movie 3",10,MovieGenre.ACTION));


        /*
        * grouping the stream of movie object by the MOVIE GENRE and
        * getting the result as map of list of movies based on MovieGenre
        * */
        Map<MovieGenre, List<Movies>> collect = movies.stream()
                .collect(Collectors.groupingBy(Movies::getGenre));
        System.out.println("printing as a list :: " +collect);


        /*
         * grouping the stream of movie object by the MOVIE GENRE and
         * getting the result as map of set of movies based on MovieGenre
         * */
        Map<MovieGenre, Set<Movies>> collect1 = movies.stream()
                .collect(Collectors.groupingBy(Movies::getGenre, Collectors.toSet()));
        System.out.println("printing as a set :: " +collect1);

       /*
       * grouping the movies by genre
       * concatenating with comma (,)
       * in the below code we are using the second implementation of the grouping by method where
       * it takes a classifier as a first argument and
       * it takes a collector as a second argument.
       * */

        Map<MovieGenre, String> collect2 = movies.stream()
                .collect(Collectors.groupingBy(
                        Movies::getGenre, //classifier
                        Collectors.mapping(Movies::getName, Collectors.joining(",")))); // collector
        System.out.println(collect2);
    }
}
