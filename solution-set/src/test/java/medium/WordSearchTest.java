package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class WordSearchTest {
    private final WordSearch solution = new WordSearch();

    @Test
    void example1() {
        boolean result = solution.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "SEE");
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "ABCB");
        assertFalse(result);
    }

    @Test
    void example3() {
        boolean result = solution.exist(new char[][]{
                {'B', 'D', 'T', 'A'},
                {'A', 'T', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
                {'A', 'D', 'E', 'E'}
        }, "TDBATC");
        assertTrue(result);
    }
}
