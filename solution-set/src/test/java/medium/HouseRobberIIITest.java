package medium;

import common.BinaryTreeBuilder;
import medium.HouseRobberIII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author Jack
 */
class HouseRobberIIITest {
    private final HouseRobberIII solution = new HouseRobberIII();

    @Test
    void example1() {
        assertEquals(7, solution.rob(new BinaryTreeBuilder(new Integer[]{3, 2, 3, null, 3, null, 1}).build()));
    }

    @Test
    void example2() {
        assertEquals(9, solution.rob(new BinaryTreeBuilder(new Integer[]{3, 4, 5, 1, 3, null, 1}).build()));
    }

    @Test
    void example3() {
        assertEquals(7, solution.rob(new BinaryTreeBuilder(new Integer[]{4, 1, null, 2, null, null, null, 3}).build()));
    }
}
