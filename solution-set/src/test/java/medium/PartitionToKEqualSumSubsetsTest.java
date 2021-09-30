package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PartitionToKEqualSumSubsetsTest {
    private final PartitionToKEqualSumSubsets solution = new PartitionToKEqualSumSubsets();

    @Test
    void example1() {
        boolean result = solution.canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 4);
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.canPartitionKSubsets(new int[]{1, 2, 3, 4}, 3);
        assertFalse(result);
    }

    @Test
    void example3() {
        boolean result = solution.canPartitionKSubsets(new int[]{1, 1, 1, 1, 2, 2, 2, 2}, 4);
        assertTrue(result);
    }

    @Test
    void example4() {
        boolean result = solution.canPartitionKSubsets(new int[]{2, 2, 2, 2, 3, 4, 5}, 4);
        assertFalse(result);
    }

    @Test
    void example5() {
        boolean result = solution.canPartitionKSubsets(new int[]{3522, 181, 521, 515, 304, 123, 2512, 312, 922, 407, 146, 1932, 4037, 2646, 3871, 269}, 5);
        assertTrue(result);
    }
}