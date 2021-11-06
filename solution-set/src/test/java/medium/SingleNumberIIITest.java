package medium;

import java.util.Arrays;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SingleNumberIIITest {
    private final SingleNumberIII solution = new SingleNumberIII();

    @Test
    void example1() {
        int[] result = solution.singleNumber(new int[]{1, 2, 1, 3, 2, 5});
        Arrays.sort(result);
        assertArrayEquals(new int[]{3, 5}, result);
    }

    @Test
    void example2() {
        int[] result = solution.singleNumber(new int[]{-1, 0});
        Arrays.sort(result);
        assertArrayEquals(new int[]{-1, 0}, result);
    }

    @Test
    void example3() {
        int[] result = solution.singleNumber(new int[]{1, 0});
        Arrays.sort(result);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}