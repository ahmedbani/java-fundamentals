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
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        }else this.rating = 3;
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

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return  "rating: " + rating +
                ", '" +body + '\'' +
                ", reviewed by '" + author + '\'' ;
    }
}
