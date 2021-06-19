package streams.streampartitioning;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoviePertitionDemo {
    public static void main(String[] args){
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Movie 1",8, MovieGenre.ACTION));
        movies.add(new Movies("Movie 2",9, MovieGenre.COMEDY));
        movies.add(new Movies("Movie 3",10,MovieGenre.ACTION));


        /*
        * partitioning the movie stream based on MovieGenre
        * then mapping the name of the movie and
        * joining the name with comma(,)
        * */
        Map<Boolean, String> collect = movies.stream().collect(
                Collectors.partitioningBy(
                        m -> m.getGenre() == MovieGenre.ACTION, //predicate
                        Collectors.mapping(Movies::getName, Collectors.joining(",")) //Collector
                ));

        System.out.println(collect);
    }
}
