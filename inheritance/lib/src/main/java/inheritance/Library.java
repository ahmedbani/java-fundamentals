/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {
        // testing that the constructor is working
        Restaurant newRestaurant = new Restaurant("kfc",2,"$");
        System.out.println(newRestaurant.toString());

        Review newReview = new Review("this restaurant has good burgers","ahmed",3);
        System.out.println(newReview.toString());

        newRestaurant.addReview(newReview);
        Review newReview2 = new Review("this restaurant has good burgers","ahmed",3);
        newRestaurant.addReview(newReview2);
        System.out.println(newRestaurant.toString());
    }
}
