package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class ReduceArraySizeToTheHalfTest {
    private final ReduceArraySizeToTheHalf solution = new ReduceArraySizeToTheHalf();

    @Test
    void example1() {
        int result = solution.minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7});
        assertEquals(2, result);
    }

}
