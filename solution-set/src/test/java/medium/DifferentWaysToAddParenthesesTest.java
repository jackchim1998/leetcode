package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DifferentWaysToAddParenthesesTest {
    private final DifferentWaysToAddParentheses solution = new DifferentWaysToAddParentheses();

    @Test
    void example1() {
        List<Integer> result = solution.diffWaysToCompute("2-1-1");
        result.sort(Integer::compareTo);
        assertArrayEquals(new Integer[]{0, 2}, result.toArray());
    }
    @Test
    void example2() {
        List<Integer> result = solution.diffWaysToCompute("2*3-4*5");
        result.sort(Integer::compareTo);
        assertArrayEquals(new Integer[]{-34,-14,-10,-10,10}, result.toArray());
    }

}