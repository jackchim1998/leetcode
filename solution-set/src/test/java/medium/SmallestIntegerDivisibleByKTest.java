package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestIntegerDivisibleByKTest {
    private final SmallestIntegerDivisibleByK solution = new SmallestIntegerDivisibleByK();

    @Test
    void example1() {
        int result = solution.smallestRepunitDivByK(1);
        assertEquals(1, result);
    }

    @Test
    void example2() {
        int result = solution.smallestRepunitDivByK(2);
        assertEquals(-1, result);
    }

    @Test
    void example3() {
        int result = solution.smallestRepunitDivByK(3);
        assertEquals(3, result);
    }

    @Test
    void example4() {
        int result = solution.smallestRepunitDivByK(17);
        assertEquals(16, result);
    }
}