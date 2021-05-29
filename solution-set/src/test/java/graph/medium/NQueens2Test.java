package graph.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class NQueens2Test {
    private final NQueens2 solution = new NQueens2();

    @Test
    void example1() {
        assertEquals(2, solution.totalNQueens(4));
    }

}
