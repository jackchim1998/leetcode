package medium;

import medium.AdvantageShuffle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class AdvantageShuffleTest {
    private final AdvantageShuffle solution = new AdvantageShuffle();

    @Test
    void example1() {
        int[] a = {2, 7, 11, 15};
        int[] b = {1, 10, 4, 11};
        int[] result = solution.advantageCount(a, b);
        assertEquals(4, compare(result, b));
    }

    @Test
    void example2() {
        int[] a = {2, 0, 4, 1, 2};
        int[] b = {1, 3, 0, 0, 2};
        int[] result = solution.advantageCount(a, b);
        assertEquals(4, compare(result, b));
    }

    private int compare(int[] result, int[] b) {
        int cnt = 0;
        for (int i = 0; i < result.length; i++)
            if (result[i] > b[i])
                cnt++;
        return cnt;
    }

}
