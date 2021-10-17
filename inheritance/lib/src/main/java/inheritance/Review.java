package inheritance;

public class Review {
    private String body;
    private String author;
    private double rating ;

    public Review() {
    }

    public Review(String body , String author , double rating) {
        this.body = body;
        this.author =author;
        this.rating = rating;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public double getRating() {
        return rating;
    }


    @Override
    public String toString() {
        return  "rating: " + rating +
                ", '" +body + '\'' +
                ", reviewed by '" + author + '\'' ;
    }
}
