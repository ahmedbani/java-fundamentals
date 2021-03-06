/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void creatingAnInstance() {
        Restaurant newRestaurant = new Restaurant("shawermaji",4,"$$");
        assertEquals("Restaurant name: shawermaji, starRating:4.0, priceCategory:$$, Reviews: []",newRestaurant.toString());
    }
    @Test void testReview(){
        Review newReview = new Review("this restaurant has good burgers","ahmed",3.5);
        assertEquals("rating: 3.5, 'this restaurant has good burgers', reviewed by 'ahmed'",newReview.toString());
    }
    @Test void testAddReview(){
        Restaurant newRestaurant = new Restaurant("meat me",5,"$$$");
        Review newReview = new Review("this restaurant is the best in smoked meat","ahmed",5);
        newRestaurant.addReview(newReview);
        assertEquals(1,newRestaurant.getReviews().size());
        assertFalse(newRestaurant.getReviews().isEmpty());
    }
    @Test void testRating(){
        Restaurant newRestaurant = new Restaurant("buffalo",4,"$$$");
        Review newReview = new Review("this restaurant has the best wing in town","rania",4.5);
        newRestaurant.addReview(newReview);
        assertEquals(4.25,newRestaurant.getStarRating());
    }
    @Test void testShop(){
        Shop funter = new Shop("funter","entertainment shop","$$");
        assertEquals("Shop{name='funter', description='entertainment shop', priceCatagory='$$', reviews=[]}",funter.toString());
    }
    @Test void testReviews(){
        Shop gameStop = new Shop("game stop", "gaming shop","$$$");
        Restaurant popeyes = new Restaurant("popeyes",4,"$$");
        Review aliReview = new Review("doesnt have all the games","ali",3);
        gameStop.addReview(aliReview);
        Review marwaReview = new Review("they have the best fried chicken burger","maram",4);
        popeyes.addReview(marwaReview);

        assertTrue(gameStop.getReviews().contains(aliReview));
        assertFalse(gameStop.getReviews().contains(marwaReview));
        assertTrue(popeyes.getReviews().contains(marwaReview));
    }
    @Test void testTheater(){
        Theater primeCinemas = new Theater("prime cinemas");
        primeCinemas.addMovie("avengers");
        primeCinemas.addMovie("vikings");
        primeCinemas.addMovie("lol");
        primeCinemas.removeMovie("venom");

        assertFalse(primeCinemas.getMovies().contains("venom"));
        assertTrue(primeCinemas.getMovies().contains("lol"));

    }
    @Test void testTheaterRreviews(){
        Theater primeCinemas = new Theater("prime cinemas");
        primeCinemas.addMovie("avengers");
        primeCinemas.addMovie("vikings");
        primeCinemas.addMovie("lol");

        ReviewMovie randsReview = new ReviewMovie("the movie is over rated","rand",2.5,"avengers");
        primeCinemas.addReview(randsReview);
        assertEquals("Theater{name='prime cinemas', movies=[avengers, vikings, lol], reviews=[rating: 2.5, 'the movie is over rated', reviewed by 'rand']}",primeCinemas.toString());
        ReviewMovie ahmedsReview = new ReviewMovie("the popcorn was on point","ahmed",5);
        primeCinemas.addReview(ahmedsReview);
        assertTrue(primeCinemas.getReviews().contains(ahmedsReview));
    }
}
