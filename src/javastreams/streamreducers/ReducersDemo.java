package javastreams.streamreducers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReducersDemo {
    public static void main(String[] args) {
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Movie 1", 8));
        movies.add(new Movies("Movie 2", 9));
        movies.add(new Movies("Movie 3", 10));
        movies.add(new Movies("Movie 4", 5));


        System.out.println("Total Movie using count :: "+movies.stream().count());

        System.out.println("Checking Condition using anyMatch :: "+movies.stream().anyMatch(movies1 -> movies1.getRating()>10));

        /*
        * if all the element in the stream matches with the provided predicate(movies1.getRating()>5) then the result will be TRUE
        * Otherwise it will be FALSE
        * */
        System.out.println("Checking Condition using allMatch :: "+movies.stream().allMatch(movies1 -> movies1.getRating()>5));

        /*
        If No element in the steam matches the provided predicate (movies1.getRating()>15) then the result will be TRUE
        Otherwise it will be FALSE
         */
        System.out.println("Checking Condition using noneMatch :: "+movies.stream().noneMatch(movies1 -> movies1.getRating()>15));

        Movies movies1 = movies.stream().findFirst().get();
        System.out.println("Getting the first movie with findFirst ::"+movies1.getName() + "-" + movies1.getRating());

        Movies movies2 = movies.stream().findAny().get();
        System.out.println("Getting any movie with findAny::"+movies2.getName()+"-"+movies2.getRating());

        /*getting the movie with the Maximum Rating*/
        Movies movies4 = movies.stream().max(Comparator.comparing(movies3 -> movies3.getRating())).get();
        System.out.println("Getting Highest rated movie with max::"+movies4.getName()+"-"+movies4.getRating());

        /*getting the movie with the minimum Rating*/
        Movies movies5 = movies.stream().min(Comparator.comparing(movies3 -> movies3.getRating())).get();
        System.out.println("Getting lowest rated movie with max::"+movies5.getName()+"-"+movies5.getRating());
    }
}
