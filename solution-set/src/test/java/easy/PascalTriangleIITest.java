package easy;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleIITest {
    private final PascalTriangleII solution = new PascalTriangleII();

    @Test
    void example1() {
        List<Integer> result = solution.getRow(3);
        assertArrayEquals(new Integer[]{1,3,3,1}, result.toArray(new Integer[0]));
    }
    @Test
    void example2() {
        List<Integer> result = solution.getRow(1);
        assertArrayEquals(new Integer[]{1,1}, result.toArray(new Integer[0]));
    }
    @Test
    void example3() {
        List<Integer> result = solution.getRow(0);
        assertArrayEquals(new Integer[]{1}, result.toArray(new Integer[0]));
    }
}