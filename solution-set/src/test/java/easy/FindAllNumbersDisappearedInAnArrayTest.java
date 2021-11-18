package easy;

import java.util.List;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindAllNumbersDisappearedInAnArrayTest {
    private final FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();

    @Test
    void example1() {
        List<Integer> result = solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        int[] sortedResult = result.stream().sorted().mapToInt(i -> i).toArray();
        assertArrayEquals(new int[]{5, 6}, sortedResult);
    }

    @Test
    void example2() {
        List<Integer> result = solution.findDisappearedNumbers(new int[]{1, 1});
        int[] sortedResult = result.stream().sorted().mapToInt(i -> i).toArray();
        assertArrayEquals(new int[]{2}, sortedResult);
    }
}