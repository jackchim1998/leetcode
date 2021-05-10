package math.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class CountPrimesTest {
    private final CountPrimes solution = new CountPrimes();

    @Test
    void example1() {
        assertEquals(4, solution.countPrimes(10));
    }

}
