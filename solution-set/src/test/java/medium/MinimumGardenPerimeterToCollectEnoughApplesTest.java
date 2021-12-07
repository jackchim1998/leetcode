package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumGardenPerimeterToCollectEnoughApplesTest {
    private final MinimumGardenPerimeterToCollectEnoughApples solution = new MinimumGardenPerimeterToCollectEnoughApples();

    @Test
    void example1() {
        long result = solution.minimumPerimeter(1);
        assertEquals(8, result);
    }

    @Test
    void example2() {
        long result = solution.minimumPerimeter(13);
        assertEquals(16, result);
    }

    @Test
    void example3() {
        long result = solution.minimumPerimeter(1000000000);
        assertEquals(5040, result);
    }
}