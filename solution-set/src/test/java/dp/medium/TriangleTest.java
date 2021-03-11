package dp.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class TriangleTest {
    private final Triangle solution = new Triangle();

    @Test
    void example1() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(arrayList(new int[]{2}));
        input.add(arrayList(new int[]{3, 4}));
        input.add(arrayList(new int[]{6, 5, 7}));
        input.add(arrayList(new int[]{4, 1, 8, 3}));
        assertEquals(11, solution.minimumTotal(input));
    }

    @Test
    void example2() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(arrayList(new int[]{-10}));
        assertEquals(-10, solution.minimumTotal(input));
    }

    private List<Integer> arrayList(int[] ints) {
        List<Integer> list = new ArrayList<>();
        for (int i : ints)
            list.add(i);
        return list;
    }
}
