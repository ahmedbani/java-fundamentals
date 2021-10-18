package inheritance;

import java.util.ArrayList;

public class Shop implements ReviewMe{
    private String name;
    private String description;
    private String priceCatagory;
    private ArrayList<Review> reviews= new ArrayList<Review>();

    public Shop(String name, String description, String priceCatagory) {
        this.name = name;
        this.description = description;
        this.priceCatagory = priceCatagory;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPriceCatagory() {
        return priceCatagory;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriceCatagory(String priceCatagory) {
        this.priceCatagory = priceCatagory;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceCatagory='" + priceCatagory + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
        System.out.println("review added from shop class");
    }
}
