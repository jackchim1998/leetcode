package medium;

import medium.HouseRobberII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class HouseRobberIITest {
    private final HouseRobberII solution = new HouseRobberII();

    @Test
    void example1() {
        assertEquals(3, solution.rob(new int[]{2, 3, 2}));
    }

    @Test
    void example2() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void example3() {
        assertEquals(0, solution.rob(new int[]{0}));
    }

    @Test
    void example4() {
        assertEquals(1, solution.rob(new int[]{1}));
    }

}
