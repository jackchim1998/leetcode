package priorityqueue.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MaximumPerformanceOfTeamTest {
    private final MaximumPerformanceOfTeam solution = new MaximumPerformanceOfTeam();

    @Test
    void example1() {
        int result = solution.maxPerformance(6, new int[]{2, 10, 3, 1, 5, 8}, new int[]{5, 4, 3, 9, 7, 2}, 2);
        assertEquals(60, result);
    }
}
