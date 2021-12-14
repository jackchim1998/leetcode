package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsecutiveCharactersTest {
    private final ConsecutiveCharacters solution = new ConsecutiveCharacters();

    @Test
    void example1() {
        int result = solution.maxPower("leetcode");
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int result = solution.maxPower("abbcccddddeeeeedcba");
        assertEquals(5, result);
    }

    @Test
    void example3() {
        int result = solution.maxPower("triplepillooooow");
        assertEquals(5, result);
    }

    @Test
    void example4() {
        int result = solution.maxPower("hooraaaaaaaaaaay");
        assertEquals(11, result);
    }

    @Test
    void example5() {
        int result = solution.maxPower("tourist");
        assertEquals(1, result);
    }
}