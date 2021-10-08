package medium;

import java.util.List;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindAllDuplicateInAnArrayTest {
    private final FindAllDuplicateInAnArray solution = new FindAllDuplicateInAnArray();

    @Test
    void example1() {
        List<Integer> result = solution.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        result.sort(Integer::compareTo);
        assertArrayEquals(new Integer[]{2, 3}, result.toArray(new Integer[0]));
    }

    @Test
    void example2() {
        List<Integer> result = solution.findDuplicates(new int[]{1, 1, 2});
        result.sort(Integer::compareTo);
        assertArrayEquals(new Integer[]{1}, result.toArray(new Integer[0]));
    }

    @Test
    void example3() {
        List<Integer> result = solution.findDuplicates(new int[]{1});
        result.sort(Integer::compareTo);
        assertArrayEquals(new Integer[]{}, result.toArray(new Integer[0]));
    }

}