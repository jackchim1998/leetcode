package medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class KeysAndRoomsTest {
    private final KeysAndRooms solution = new KeysAndRooms();

    @Test
    void example1() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(toList(new Integer[]{1}));
        input.add(toList(new Integer[]{2}));
        input.add(toList(new Integer[]{3}));
        input.add(toList(new Integer[]{0}));
        assertTrue(solution.canVisitAllRooms(input));
    }

    @Test
    void example2() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(toList(new Integer[]{1, 3}));
        input.add(toList(new Integer[]{3, 0, 1}));
        input.add(toList(new Integer[]{2}));
        input.add(toList(new Integer[]{0}));
        assertFalse(solution.canVisitAllRooms(input));
    }

    @Test
    void example3() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(toList(new Integer[]{6, 7, 8}));
        input.add(toList(new Integer[]{5, 4, 9}));
        input.add(toList(new Integer[]{}));
        input.add(toList(new Integer[]{8}));
        input.add(toList(new Integer[]{4}));
        input.add(toList(new Integer[]{}));
        input.add(toList(new Integer[]{1, 9, 2, 3}));
        input.add(toList(new Integer[]{7}));
        input.add(toList(new Integer[]{6, 5}));
        input.add(toList(new Integer[]{2, 3, 1}));
        assertTrue(solution.canVisitAllRooms(input));
    }

    private List<Integer> toList(Integer[] ints) {
        return Arrays.asList(ints);
    }

}
