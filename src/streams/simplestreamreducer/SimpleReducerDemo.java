package streams.simplestreamreducer;

import streams.simplestreamreducer.Movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SimpleReducerDemo {
    public static void main(String[] args){
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Movie 1", 8));
        movies.add(new Movies("Movie 2", 9));
        movies.add(new Movies("Movie 3", 10));
        movies.add(new Movies("Movie 4", 5));

        // way 1
        /*
        * we are mapping each movie to it's Rating
        * we are using reduce method to get all the sum of the movie rating
        * As the reduce method takes binaryOperator, that's why we are providing two input (a,b) and
        * it's returning the sum of all the rating's
        * */
        Optional<Integer> reduce = movies.stream()
                .map(m -> m.getRating())
                .reduce((a, b) -> a + b);

        System.out.println("way 1 :"+ reduce.orElse(0));

        // way 2
        /*
        * we are doing all the things above expect
        * here, we are using method reference (Integer::sum) instead of lamda function
        * */
        Optional<Integer> reduce2 = movies.stream()
                .map(m -> m.getRating())
                .reduce(Integer::sum);

        System.out.println("way 2 :"+reduce2.orElse(0));

        // way 3
        /*
        * in the way 3 we are doing the same thing like above but in addition,
        * we are using a different implementation of the reduce method which take a default value
        * as a first parameter
        * */
        Integer reduce3 = movies.stream()
                .map(m -> m.getRating())
                .reduce(0,Integer::sum);

        System.out.println("way 3 :"+reduce3);


    }
}
