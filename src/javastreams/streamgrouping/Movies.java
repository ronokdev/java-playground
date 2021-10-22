package javastreams.streamgrouping;


public class Movies {
    private String name;
    private int rating;
    private MovieGenre genre;

    public Movies(String name, int rating,MovieGenre genre) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                '}';
    }

    public MovieGenre getGenre() {
        return genre;
    }
}
