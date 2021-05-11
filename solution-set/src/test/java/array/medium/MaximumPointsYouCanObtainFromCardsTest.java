package array.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximumPointsYouCanObtainFromCardsTest {
    private final MaximumPointsYouCanObtainFromCards solution = new MaximumPointsYouCanObtainFromCards();

    @Test
    void example1() {
        assertEquals(12, solution.maxScore(new int[]{1,2,3,4,5,6,1}, 3));
    }
}
