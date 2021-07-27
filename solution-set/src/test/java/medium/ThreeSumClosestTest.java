package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class ThreeSumClosestTest {
    private final ThreeSumClosest solution = new ThreeSumClosest();

    @Test
    void example1() {
        int result = solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        assertEquals(2, result);
    }

}
