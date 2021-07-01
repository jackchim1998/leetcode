package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class GrayCodeTest {
    private final GrayCode solution = new GrayCode();

    @Test
    void exampleOf4() {
        int n = 4;
        validate(solution.grayCode(n), n);
    }

    private boolean validate(List<Integer> result, int n) {
        int size = 1 << n;
        assertEquals(result.size(), size);
        for (int i = 0; i < size; i++)
            if (!oneBitChanged(result.get(i), result.get((i + size - 1) % size)))
                return false;
        return true;
    }

    private boolean oneBitChanged(int i, int j) {
        int xor = i ^ j;
        if (xor == 0) return false;
        while ((xor & 1) == 0)
            xor >>= 1;
        return xor == 1;
    }
}
