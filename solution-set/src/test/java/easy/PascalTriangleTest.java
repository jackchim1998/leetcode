package easy;

import easy.PascalTriangle;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class PascalTriangleTest {
    private final PascalTriangle solution = new PascalTriangle();

    @Test
    void example1() {
        List<List<Integer>> result = solution.generate(5);
        assertEquals(5, result.size());
        assertArrayEquals(new int[]{1}, result.get(0).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(new int[]{1, 1}, result.get(1).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(new int[]{1, 2, 1}, result.get(2).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(new int[]{1, 3, 3, 1}, result.get(3).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(new int[]{1, 4, 6, 4, 1}, result.get(4).stream().mapToInt(i -> i).toArray());
    }
}
