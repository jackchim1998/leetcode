package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class SortColorsTest {
    private final SortColors solution = new SortColors();

    @Test
    void example1() {
        int[] arr = {2, 0, 2, 1, 1, 0};
        solution.sortColors(arr);
        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, arr);
    }

    @Test
    void example2() {
        int[] arr = {2, 0, 1};
        solution.sortColors(arr);
        Assertions.assertArrayEquals(new int[]{0, 1, 2}, arr);
    }

    @Test
    void example3() {
        int[] arr = {0};
        solution.sortColors(arr);
        Assertions.assertArrayEquals(new int[]{0}, arr);
    }

    @Test
    void example4() {
        int[] arr = {1};
        solution.sortColors(arr);
        Assertions.assertArrayEquals(new int[]{1}, arr);
    }
}
