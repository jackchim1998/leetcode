package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class BrickWallsTest {
    private final BrickWalls solution = new BrickWalls();

    @Test
    void example1() {
        List<List<Integer>> input = List.of(
                List.of(1, 2, 2, 1),
                List.of(3, 1, 2),
                List.of(1, 3, 2),
                List.of(2, 4),
                List.of(1, 3, 1, 1)
        );
        assertEquals(2, solution.leastBricks(input));
    }

}
