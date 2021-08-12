package medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Jack
 */
class TopKFrequentElementsTest {
    private final TopKFrequentElements solution = new TopKFrequentElements();

    @Test
    void example1() {
        int[] result = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void example2() {
        int[] result = solution.topKFrequent(new int[]{1}, 1);
        Arrays.sort(result);
        assertArrayEquals(new int[]{1}, result);
    }
}
