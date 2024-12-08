package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumLimitOfBallsInABagTest {
    private final MinimumLimitOfBallsInABag solution = new MinimumLimitOfBallsInABag();

    @Test
    void example1() {
        int result = solution.minimumSize(new int[]{9}, 2);
        assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.minimumSize(new int[]{2, 4, 8, 2}, 4);
        assertEquals(2, result);
    }

}