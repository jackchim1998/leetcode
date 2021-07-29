package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class RemoveAllAdjacentDuplicatesInStringTest {
    private final RemoveAllAdjacentDuplicatesInString solution = new RemoveAllAdjacentDuplicatesInString();

    @Test
    void example1() {
        assertEquals("ay", solution.removeDuplicates("azxxzy"));
    }
}
