package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class OpenTheLockTest {
    private final OpenTheLock solution = new OpenTheLock();

    @Test
    void example1() {
        int result = solution.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202");
        assertEquals(6, result);
    }

}
