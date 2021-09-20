package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfBalloonsTest {
    private final MaximumNumberOfBalloons solution = new MaximumNumberOfBalloons();

    @Test
    void example1() {
        int result = solution.maxNumberOfBalloons("nlaebolko");
        assertEquals(1, result);
    }

    @Test
    void example2() {
        int result = solution.maxNumberOfBalloons("loonbalxballpoon");
        assertEquals(2, result);
    }

    @Test
    void example3() {
        int result = solution.maxNumberOfBalloons("leetcode");
        assertEquals(0, result);
    }
}