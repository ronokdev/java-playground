package javastreams.streampeeking;

import java.util.ArrayList;
import java.util.List;

public class PeekingDemo {
    public static void main(String[] args){
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Movie 1",8));
        movies.add(new Movies("Movie 2",9));
        movies.add(new Movies("Movie 3",10));



        movies.stream()
              .peek(m-> System.out.println(m.getName()+"-"+m.getRating()))
              .filter(movies1 -> movies1.getRating()>8)
              .peek(p -> System.out.println("peeking : "+p.getName()))
              .map(movies1 -> movies1.getName())
              .forEach(x-> System.out.println(x));
    }
}
