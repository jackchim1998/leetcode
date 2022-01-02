package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class PairsOfSongsWithTotalDurationsDivisibleBy60Test {
    private final PairsOfSongsWithTotalDurationsDivisibleBy60 solution = new PairsOfSongsWithTotalDurationsDivisibleBy60();

    @Test
    void example1() {
        int result = solution.numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40});
        assertEquals(result, 3);
    }

    @Test
    void example2() {
        int result = solution.numPairsDivisibleBy60(new int[]{60, 60, 60});
        assertEquals(result, 3);
    }

}