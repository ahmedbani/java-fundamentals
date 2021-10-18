package inheritance;

import java.util.ArrayList;

public class Theater implements ReviewMe{
    private String name;
    private ArrayList<String> movies = new ArrayList<String>();
    private ArrayList<Review> reviews = new ArrayList<Review>();

    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void addMovie(String movieName){
        movies.add(movieName);
    }

    public void removeMovie(String movieName){
        if(movies.contains(movieName))
            movies.remove(movieName);
        else System.out.println("the movie " + movieName+" is not in the theater");
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }
}
