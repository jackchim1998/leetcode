package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class HouseRobberTest {
    private final HouseRobber solution = new HouseRobber();

    @Test
    void example1() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void example2() {
        assertEquals(12, solution.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    void example3() {
        assertEquals(20, solution.rob(new int[]{10, 1, 1, 10}));
    }

}
