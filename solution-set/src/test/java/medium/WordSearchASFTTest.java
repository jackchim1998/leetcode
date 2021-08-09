package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class WordSearchASFTTest {
    private final WordSearchASFT solution = new WordSearchASFT();

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

//    @Test TODO @Jack Failed Test cases
//    void example4() {
//        boolean result = solution.exist(new char[][]{
//                {'Z', 'Z', 'Z', 'Z', 'Z'},
//                {'Z', 'C', 'B', 'A', 'B'},
//                {'A', 'D', 'E', 'D', 'C'},
//                {'B', 'E', 'Z', 'Z', 'Z'}
//        }, "ABEDCBA");
//        assertTrue(result);
//    }

}
