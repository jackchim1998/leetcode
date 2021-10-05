package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {
    private final ClimbingStairs solution = new ClimbingStairs();

    @Test
    void example1() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    void example2() {
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    void example3() {
        assertEquals(89, solution.climbStairs(10));
    }
}
