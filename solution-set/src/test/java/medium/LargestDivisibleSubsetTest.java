package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LargestDivisibleSubsetTest {
    private final LargestDivisibleSubset solution = new LargestDivisibleSubset();

    @Test
    void example1() {
        int[] result = solution.largestDivisibleSubset(new int[]{1, 2, 3})
                .stream().mapToInt(i -> i).toArray();
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void example2() {
        int[] result = solution.largestDivisibleSubset(new int[]{1, 2, 4, 8})
                .stream().mapToInt(i -> i).toArray();
        assertArrayEquals(new int[]{1, 2, 4, 8}, result);
    }

}