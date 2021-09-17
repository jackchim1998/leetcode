package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntersectionOfTwoArraysIITest {
    private final IntersectionOfTwoArraysII solution = new IntersectionOfTwoArraysII();

    @Test
    void example1() {
        int[] result = solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        Arrays.sort(result);
        assertArrayEquals(new int[]{2, 2}, result);
    }

    @Test
    void example2() {
        int[] result = solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        Arrays.sort(result);
        assertArrayEquals(new int[]{4, 9}, result);
    }
}