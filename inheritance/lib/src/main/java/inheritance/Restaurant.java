package inheritance;

import java.util.ArrayList;

public class Restaurant implements ReviewMe {
    private String name;
    private double starRating;
    private String  priceCategory ;
    private ArrayList<Review> reviews = new ArrayList<Review>();

    public Restaurant() {

    }

    public Restaurant(String name,double starRating,String priceCategory) {
        this.name = name;
        this.starRating =starRating;
        this.priceCategory = priceCategory;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public double getStarRating() {
        return starRating;
    }

    @Override
    public String toString() {
        return  "Restaurant name: "+name +
                ", starRating:" + starRating +
                ", priceCategory:" + priceCategory +
                ", Reviews: " +reviews ;
    }

    public void addReview(Review review){
        this.reviews.add(review);
        if (reviews.contains(review)) {
            double sum = starRating;
            for (Review item : reviews) {
                sum += item.getRating();
            }
            double x = reviews.size() + 1;
            this.starRating = sum / x;
        }
        System.out.println("review added from restaurant class");
    }
}
