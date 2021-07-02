package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Jack
 */
class FindKClosestElementsTest {
    private final FindKClosestElements solution = new FindKClosestElements();

    @Test
    void example1() {
        List<Integer> result = solution.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 6);
        assertArrayEquals(new Integer[]{2, 3, 4, 5}, result.toArray());
    }

    @Test
    void example2() {
        List<Integer> result = solution.findClosestElements(new int[]{1}, 1, 1);
        assertArrayEquals(new Integer[]{1}, result.toArray());
    }
}
