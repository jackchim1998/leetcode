package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class KInversePairsArrayTest {
    private final KInversePairsArray solution = new KInversePairsArray();

    @Test
    void example1() {
        assertEquals(5, solution.kInversePairs(4, 2));
    }

    @Test
    void example2() {
        assertEquals(1, solution.kInversePairs(4, 6));
    }

    @Test
    void example3() {
        assertEquals(3, solution.kInversePairs(4, 5));
    }
}
