package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesTest {
    private final MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

    @Test
    void example1() {
        int result = solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1});
        assertEquals(2, result);
    }
}
