package hard;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathIIITest {
    @Test
    void example1() {
        int[][] input = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}
        };
        int result = new UniquePathIII().uniquePathsIII(input);
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int[][] input = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 2}
        };
        int result = new UniquePathIII().uniquePathsIII(input);
        assertEquals(4, result);
    }

    @Test
    void example3() {
        int[][] input = {
                {0, 1},
                {2, 0}
        };
        int result = new UniquePathIII().uniquePathsIII(input);
        assertEquals(0, result);
    }

}