package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {
    private final ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void example1() {
        boolean result = solution.containsDuplicate(new int[]{1, 2, 3, 1});
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = solution.containsDuplicate(new int[]{1, 2, 3, 4});
        assertFalse(result);
    }

    @Test
    void example3() {
        boolean result = solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        assertTrue(result);
    }

}