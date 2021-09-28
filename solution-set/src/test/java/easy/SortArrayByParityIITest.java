package easy;

import java.util.Arrays;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityIITest {
    private final SortArrayByParityII solution = new SortArrayByParityII();

    @Test
    void example1() {
        validate(new int[]{4, 2, 5, 7});
    }

    @Test
    void example2() {
        validate(new int[]{2, 3});
    }

    private void validate(int[] input) {
        int[] originalInput = input.clone();
        int[] result = solution.sortArrayByParityII(input);
        validateInputResultNotChangedExceptOrder(result.clone(), originalInput);
        // odd index has odd value, even index has even value
        for (int i = 0; i < result.length; i++)
            assertEquals(i % 2, result[i] % 2);
    }

    // ensure the elements do not changed except order
    private void validateInputResultNotChangedExceptOrder(int[] result, int[] input) {
        Arrays.sort(input);
        Arrays.sort(result);
        assertArrayEquals(input, result);
    }
}