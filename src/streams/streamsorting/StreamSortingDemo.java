package streams.streamsorting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamSortingDemo {
    public static void main(String[] args){
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("movie 1",44));
        movieList.add(new Movie("movie 3",66));
        movieList.add(new Movie("movie 2",55));
        movieList.add(new Movie("movie 6",96));


        // we are sorting with title by using the compare method of the Comparator interface
        // we can replace (a,b)->a.getTitle().compareTo(b.getTitle()) to
        // Comparator.comparing(a->a.getTitle()) to
        // Movie::getTitle
        movieList.stream()
                .sorted((a,b)->a.getTitle().compareTo(b.getTitle()))
                .map(x->x.getTitle())
                .forEach(x-> System.out.println(x));


        // we are Sorting with like and title by using the comparing method of the Comparator interface
        System.out.println("Using comparing method without method reference");
        movieList.stream()
                .sorted(Comparator.comparing(a->a.getTitle()))
                .map(x->x.getTitle())
                .forEach(x-> System.out.println(x));

        // In below as we are just calling a method of the Movie object we can replace the a->a.getLike() with Movie::getLike
        // we are using the reversed() method to sort the element of the stream in reverse order
        System.out.println("using comparing method with method reference and reversed method");
        movieList.stream()
                .sorted(Comparator.comparing(Movie::getLike).reversed())
                .map(movie -> movie.getLike())
                .forEach(x-> System.out.println(x));
    }
}
