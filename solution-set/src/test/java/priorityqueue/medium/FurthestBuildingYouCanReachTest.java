package priorityqueue.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class FurthestBuildingYouCanReachTest {
    private final FurthestBuildingYouCanReach solution = new FurthestBuildingYouCanReach();

    @Test
    void example1() {
        assertEquals(7, solution.furthestBuilding(new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19}, 10, 2));
    }
}
