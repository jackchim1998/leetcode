package medium;

import medium.RemoveAllAdjacentDuplicatesInStringII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class RemoveAllAdjacentDuplicatesInStringIITest {
    private final RemoveAllAdjacentDuplicatesInStringII solution = new RemoveAllAdjacentDuplicatesInStringII();

    @Test
    void example1() {
        assertEquals("aa", solution.removeDuplicates("deeedbbcccbdaa", 3));
    }

    @Test
    void example2() {
        assertEquals("ps", solution.removeDuplicates("pbbcggttciiippooaais", 2));
    }
}
