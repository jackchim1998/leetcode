package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class DominoAndTrominoTilingTest {
    private final DominoAndTrominoTiling solution = new DominoAndTrominoTiling();


    @Test
    void example1() {
        int result = solution.numTilings(3);
        assertEquals(5, result);
    }

    @Test
    void example2() {
        int result = solution.numTilings(1);
        assertEquals(1, result);
    }

    @Test
    void example3() {
        int result = solution.numTilings(10);
        assertEquals(1255, result);
    }

    @Test
    void example4() {
        int result = solution.numTilings(30);
        assertEquals(312342182, result);
    }
}