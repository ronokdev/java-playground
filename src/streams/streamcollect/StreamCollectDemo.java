package streams.streamcollect;

import streams.streamcollect.Movies;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectDemo {
    public static void main(String[] args){
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Movie 1", 8));
        movies.add(new Movies("Movie 2", 9));
        movies.add(new Movies("Movie 3", 10));
        movies.add(new Movies("Movie 4", 5));

        /*
        * Filtering the movie object with the rating and
        * getting the result as a list of String
        * */
        List<String> collect = movies.stream()
                .filter(movies1 -> movies1.getRating() > 8)
                .map(m -> m.getName())
                .collect(Collectors.toList());

        System.out.println(collect);


        /*
        * filtering the movie object with the rating and
        * getting the summarizing result
        * */
        IntSummaryStatistics collect1 = movies
                .stream()
                .filter(movies1 -> movies1.getRating() > 7)
                .collect(Collectors.summarizingInt(m -> m.getRating()));

        System.out.println(collect1);


        /*
        * mapping each movie to it's name and
        * joining with delimiter : ,
        * */
        String collect2 = movies.stream()
                .map(m -> m.getName())
                .collect(Collectors.joining(", "));

        System.out.println(collect2);
    }
}
