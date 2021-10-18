package inheritance;

public class ReviewMovie extends Review{
    private String movieName;

    public ReviewMovie(String body, String author, double rating, String movieName) {
        super(body, author, rating);
        this.movieName = movieName;
    }

    public ReviewMovie() {
    }

    public ReviewMovie(String body, String author, double rating) {
        super(body, author, rating);
    }
}
