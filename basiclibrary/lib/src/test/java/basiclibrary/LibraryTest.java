/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    Library testObjects = new Library();
    @Test public void testRolls(){
        int [] arr = testObjects.roll(3);
        assertEquals(3,arr.length);

    }
    @Test public void testContainDuplicates(){
        int [] arr = {1,2,3,4,5};
        int [] arr2 = {2,3,2,3,6};
        assertTrue(testObjects.containsDuplicates( arr2));
        assertFalse(testObjects.containsDuplicates(arr));
    }
    @Test public void testCalculateAverage(){
        int []arr = {30,24,12,50,32,1};
        assertEquals(24.833333333333332,testObjects.calculateAverage(arr));
    }
    @Test public void testAverageOfLowestArray(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(57.0,testObjects.averageOfLowestArray(weeklyMonthTemperatures));
    }
}
