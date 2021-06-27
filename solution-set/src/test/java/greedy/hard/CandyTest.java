package greedy.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class CandyTest {
    private final Candy solution = new Candy();

    @Test
    void example1() {
        int solution = this.solution.candy(new int[]{1, 2, 2});
        assertEquals(4, solution);
    }
}
