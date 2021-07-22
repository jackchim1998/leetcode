package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class PartitionArrayIntoDisjointIntervalsTest {
    private final PartitionArrayIntoDisjointIntervals solution = new PartitionArrayIntoDisjointIntervals();

    @Test
    void example1() {
        int result = solution.partitionDisjoint(new int[]{5, 0, 3, 8, 6});
        assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.partitionDisjoint(new int[]{1, 1, 1, 0, 6, 12});
        assertEquals(4, result);
    }


}
