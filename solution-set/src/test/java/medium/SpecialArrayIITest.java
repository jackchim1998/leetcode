package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialArrayIITest {
    private final SpecialArrayII solution = new SpecialArrayII();

    @Test
    void example1() {
        boolean[] result = solution.isArraySpecial(new int[]{3, 4, 1, 2, 6}, new int[][]{
                new int[]{0, 4}
        });
        assertArrayEquals(new boolean[]{false}, result);
    }

    @Test
    void example2() {
        boolean[] result = solution.isArraySpecial(new int[]{4, 3, 1, 6}, new int[][]{
                new int[]{0, 2},
                new int[]{2, 3}
        });
        assertArrayEquals(new boolean[]{false, true}, result);
    }
    @Test
    void example3() {
        boolean[] result = solution.isArraySpecial(new int[]{2, 2}, new int[][]{
                new int[]{0, 0}
        });
        assertArrayEquals(new boolean[]{true}, result);
    }

}