package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptimalDivisionTest {
    private final OptimalDivision solution = new OptimalDivision();

    @Test
    void example1() {
        String solution = this.solution.optimalDivision(new int[]{1000, 100, 10, 2});
        assertEquals("1000/(100/10/2)", solution);
    }
    @Test
    void example2() {
        String solution = this.solution.optimalDivision(new int[]{2,3,4});
        assertEquals("2/(3/4)", solution);
    }

}