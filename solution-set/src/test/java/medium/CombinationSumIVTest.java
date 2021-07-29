package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class CombinationSumIVTest {
    private final CombinationSumIV solution = new CombinationSumIV();

    @Test
    void example1() {
        assertEquals(7, solution.combinationSum4(new int[]{1, 2, 3}, 4));
    }
}
