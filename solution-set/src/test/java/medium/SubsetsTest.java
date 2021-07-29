package medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class SubsetsTest {
    private final Subsets solution = new Subsets();

    @Test
    void example1() {
        List<List<Integer>> output = solution.subsets(new int[]{1, 2, 3});
        validate(new int[][]{
                {},
                {1},
                {2},
                {1, 2},
                {3},
                {1, 3},
                {2, 3},
                {1, 2, 3}
        }, output);
    }

    private void validate(int[][] expected, List<List<Integer>> actual) {
        assertEquals(expected.length, actual.size());
        boolean[] passed = new boolean[expected.length];
        for (List<Integer> actualAns : actual)
            for (int i = 0; i < expected.length; i++)
                if (Arrays.equals(expected[i], actualAns.stream().mapToInt(x -> x).toArray()))
                    passed[i] = true;
        for (boolean passedAns : passed) assertTrue(passedAns);
    }
}
