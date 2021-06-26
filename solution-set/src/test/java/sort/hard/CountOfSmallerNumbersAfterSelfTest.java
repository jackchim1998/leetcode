package sort.hard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Jack
 */
class CountOfSmallerNumbersAfterSelfTest {
    private final CountOfSmallerNumbersAfterSelf solution = new CountOfSmallerNumbersAfterSelf();

    @Test
    void example1() {
        List<Integer> result = solution.countSmaller(new int[]{5, 2, 6, 1});
        assertArrayEquals(new int[]{2, 1, 1, 0}, result.stream().mapToInt(i -> i).toArray());
    }

    @Test
    void example2() {
        List<Integer> result = solution.countSmaller(new int[]{-1, -1});
        assertArrayEquals(new int[]{0, 0}, result.stream().mapToInt(i -> i).toArray());
    }
}
