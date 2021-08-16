package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class RangeSumQueryImmutableTest {

    @Test
    void example1() {
        RangeSumQueryImmutable solution = new RangeSumQueryImmutable(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, solution.sumRange(0, 2));
        assertEquals(-1, solution.sumRange(2, 5));
        assertEquals(-3, solution.sumRange(0, 5));
    }

}
