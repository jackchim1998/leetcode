package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class PowTest {
    private final Pow solution = new Pow();

    @Test
    void example1() {
        assertEquals(Math.pow(2, 10), solution.myPow(2, 10));
    }

    @Test
    void example2() {
        assertEquals(Math.pow(2.1, 3), solution.myPow(2.1, 3));
    }

    @Test
    void example3() {
        assertEquals(Math.pow(2,-2), solution.myPow(2, -2));
    }

    @Test
    void example4() {
        assertEquals(1, solution.myPow(1, Integer.MAX_VALUE));
    }

}
