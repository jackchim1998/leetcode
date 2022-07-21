package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jack
 */
class RemoveElementTest {
    private final RemoveElement solution = new RemoveElement();

    @Test
    void example1() {
        int[] arr = {3, 2, 2, 3};
        int result = solution.removeElement(arr, 3);
        assertEquals(2, result);
        int[] subArray = Arrays.copyOf(arr, result);
        Arrays.sort(subArray);
        assertArrayEquals(new int[]{2, 2}, subArray);
    }

    @Test
    void example2() {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int result = solution.removeElement(arr, 2);
        assertEquals(5, result);
        int[] subArray = Arrays.copyOf(arr, result);
        Arrays.sort(subArray);
        assertArrayEquals(new int[]{0, 0, 1, 3, 4}, subArray);
    }

    @Test
    void example3() {
        int[] arr = {};
        int result = solution.removeElement(arr, 0);
        assertEquals(0, result);
        int[] subArray = Arrays.copyOf(arr, result);
        Arrays.sort(subArray);
        assertArrayEquals(new int[]{}, subArray);
    }

    @Test
    void example4() {
        int[] arr = {1};
        int result = solution.removeElement(arr, 1);
        assertEquals(0, result);
        int[] subArray = Arrays.copyOf(arr, result);
        Arrays.sort(subArray);
        assertArrayEquals(new int[]{}, subArray);
    }
}