package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class SortColorsTest {
    private final SortColors solution = new SortColors();

    @Test
    void onePassExample1() {
        int[] arr = {2, 0, 2, 1, 1, 0};
        solution.sortColorsOnePass(arr);
        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, arr);
    }

    @Test
    void onePassExample2() {
        int[] arr = {2, 0, 1};
        solution.sortColorsOnePass(arr);
        Assertions.assertArrayEquals(new int[]{0, 1, 2}, arr);
    }

    @Test
    void onePassExample3() {
        int[] arr = {0};
        solution.sortColorsOnePass(arr);
        Assertions.assertArrayEquals(new int[]{0}, arr);
    }

    @Test
    void onePassExample4() {
        int[] arr = {1};
        solution.sortColorsOnePass(arr);
        Assertions.assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void onePassExample5() {
        int[] arr = {1, 0, 1};
        solution.sortColorsOnePass(arr);
        Assertions.assertArrayEquals(new int[]{0, 1, 1}, arr);
    }
    @Test
    void twoPassExample1() {
        int[] arr = {2, 0, 2, 1, 1, 0};
        solution.sortColorsTwoPass(arr);
        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, arr);
    }

    @Test
    void twoPassExample2() {
        int[] arr = {2, 0, 1};
        solution.sortColorsTwoPass(arr);
        Assertions.assertArrayEquals(new int[]{0, 1, 2}, arr);
    }

    @Test
    void twoPassExample3() {
        int[] arr = {0};
        solution.sortColorsTwoPass(arr);
        Assertions.assertArrayEquals(new int[]{0}, arr);
    }

    @Test
    void twoPassExample4() {
        int[] arr = {1};
        solution.sortColorsTwoPass(arr);
        Assertions.assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void twoPassExample5() {
        int[] arr = {1, 0, 1};
        solution.sortColorsTwoPass(arr);
        Assertions.assertArrayEquals(new int[]{0, 1, 1}, arr);
    }
}
