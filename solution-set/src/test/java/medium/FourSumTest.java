package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class FourSumTest {
    private final FourSum solution = new FourSum();

    @Test
    void example1() {
        List<List<Integer>> result = solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-2, -1, 1, 2));
        expected.add(List.of(-2, 0, 0, 2));
        expected.add(List.of(-1, 0, 0, 1));
        validate(expected, result);
    }

    @Test
    void example2() {
        List<List<Integer>> result = solution.fourSum(new int[]{0, 0, 0}, 0);
        List<List<Integer>> expected = new ArrayList<>();
        validate(expected, result);
    }

    private void validate(List<List<Integer>> expected, List<List<Integer>> result) {
        Assertions.assertEquals(expected.size(), result.size());
        boolean[] exists = new boolean[expected.size()];
        for (int i = 0; i < expected.size(); i++)
            for (List<Integer> integers : result)
                if (expected.get(i).equals(integers)) {
                    exists[i] = true;
                    break;
                }
        for (boolean exist : exists)
            assertTrue(exist);
    }

}
