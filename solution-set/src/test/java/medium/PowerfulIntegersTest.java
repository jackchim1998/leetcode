package medium;

import medium.PowerfulIntegers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Jack
 */
class PowerfulIntegersTest {
    private final PowerfulIntegers solution = new PowerfulIntegers();

    @Test
    void example1() {
        List<Integer> result = solution.powerfulIntegers(2, 3, 10);
        assertArrayEquals(new int[]{2, 3, 4, 5, 7, 9, 10}, result.stream().sorted().mapToInt(i -> i).toArray());
    }
}
