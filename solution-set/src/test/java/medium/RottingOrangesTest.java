package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class RottingOrangesTest {
    private final RottingOranges solution = new RottingOranges();

    @Test
    void example1() {
        int result = solution.orangesRotting(new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        });
        assertEquals(4, result);
    }

    @Test
    void example2() {
        int result = solution.orangesRotting(new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        });
        assertEquals(-1, result);
    }

    @Test
    void example3() {
        int result = solution.orangesRotting(new int[][]{
                {0, 2}
        });
        assertEquals(0, result);
    }

    @Test
    void example4() {
        int result = solution.orangesRotting(new int[][]{
                {0}
        });
        assertEquals(0, result);
    }
}