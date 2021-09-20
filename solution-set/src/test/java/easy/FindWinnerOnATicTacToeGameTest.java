package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FindWinnerOnATicTacToeGameTest {
    private final FindWinnerOnATicTacToeGame solution = new FindWinnerOnATicTacToeGame();

    @Test
    void example1() {
        String result = solution.tictactoe(new int[][]{
                {0, 0},
                {2, 0},
                {1, 1},
                {2, 1},
                {2, 2}
        });
        assertEquals("A", result);
    }

    @Test
    void example2() {
        String result = solution.tictactoe(new int[][]{
                {0, 0},
                {1, 1},
                {0, 1},
                {0, 2},
                {1, 0},
                {2, 0}
        });
        assertEquals("B", result);
    }

    @Test
    void example3() {
        String result = solution.tictactoe(new int[][]{
                {0, 0},
                {1, 1},
                {2, 0},
                {1, 0},
                {1, 2},
                {2, 1},
                {0, 1},
                {0, 2},
                {2, 2}
        });
        assertEquals("Draw", result);
    }

    @Test
    void example4() {
        String result = solution.tictactoe(new int[][]{
                {1, 1}
        });
        assertEquals("Pending", result);
    }
}