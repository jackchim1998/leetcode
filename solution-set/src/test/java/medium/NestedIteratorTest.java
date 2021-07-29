package medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Jack
 */
class NestedIteratorTest {
    @Test
    void example1() {
        List<NestedIterator.NestedInteger> values = List.of(new NestedIterator.NestedInteger(List.of(new NestedIterator.NestedInteger(1), new NestedIterator.NestedInteger(1))), new NestedIterator.NestedInteger(2), new NestedIterator.NestedInteger(List.of(new NestedIterator.NestedInteger(1), new NestedIterator.NestedInteger(1))));
        assertArrayEquals(new int[]{1, 1, 2, 1, 1}, flatten(values));
    }

    public int[] flatten(List<NestedIterator.NestedInteger> values) {
        NestedIterator iterator = new NestedIterator(values);
        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext())
            result.add(iterator.next());
        return result.stream().mapToInt(i -> i).toArray();
    }
}
