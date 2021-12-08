package easy;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeTiltTest {
    private final BinaryTreeTilt solution = new BinaryTreeTilt();

    @Test
    void example1() {
        int result = solution.findTilt(new BinaryTreeBuilder(new Integer[]{1, 2, 3}).build());
        assertEquals(1, result);
    }

    @Test
    void example2() {
        int result = solution.findTilt(new BinaryTreeBuilder(new Integer[]{4, 2, 9, 3, 5, null, 7}).build());
        assertEquals(15, result);
    }

    @Test
    void example3() {
        int result = solution.findTilt(new BinaryTreeBuilder(new Integer[]{21, 7, 14, 1, 1, 2, 2, 3, 3}).build());
        assertEquals(9, result);
    }

}