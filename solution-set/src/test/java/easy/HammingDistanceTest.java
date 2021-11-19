package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class HammingDistanceTest {
    private final HammingDistance solution = new HammingDistance();

    @Test
    void example1() {
        int result = solution.hammingDistance(1, 4);
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int result = solution.hammingDistance(3, 1);
        assertEquals(1, result);
    }

}