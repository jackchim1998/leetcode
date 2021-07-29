package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Jack
 */
class ValidTriangleNumberTest {
    private final ValidTriangleNumber solution = new ValidTriangleNumber();

    @Test
    void example1() {
        int result = solution.triangleNumber(new int[]{2, 2, 3, 4});
        Assertions.assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.triangleNumber(new int[]{24, 3, 82, 22, 35, 84, 19});
        Assertions.assertEquals(10, result);
    }

    @Test
    void example3() {
        int result = solution.triangleNumber(new int[]{34, 75, 96, 10, 60, 70, 70, 45});
        Assertions.assertEquals(36, result);
    }

    @Test
    void example4() {
        int result = solution.triangleNumber(new int[]{0, 1, 1, 1});
        Assertions.assertEquals(1, result);
    }

    @Test
    void example5() {
        int result = solution.triangleNumber(new int[]{95, 81, 22, 28, 46, 46, 27, 86, 35, 96});
        Assertions.assertEquals(62, result);
    }
}
