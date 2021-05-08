package streams.Imperativevsfunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args){
        List<Movie> movieList = Arrays.asList(
                new Movie("movie 1",20),
                new Movie("movie 2",40),
                new Movie("movie 3",70)
        );

        //The below style of code is known as Imperative Programming
        int count=0;
        for(Movie listOfMovie:movieList)
            if(listOfMovie.getLike()>=40)
                count++;
        System.out.println(count);

        // Declarative(Functional) Programming
        long count1 = movieList.stream()
                .filter(movie -> movie.getLike() >= 40)
                .count();
        System.out.println(count1);

    }
}
