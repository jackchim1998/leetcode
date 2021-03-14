package dp.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class BeautifulArrangementTest {
    private final BeautifulArrangement solution = new BeautifulArrangement();

    @Test
    void example1() {
        assertEquals(1, solution.countArrangement(1));
    }

    @Test
    void example2() {
        assertEquals(2, solution.countArrangement(2));
    }

    @Test
    void example3() {
        assertEquals(3, solution.countArrangement(3));
    }

    @Test
    void example4() {
        assertEquals(8, solution.countArrangement(4));
    }

}
