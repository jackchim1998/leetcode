package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class CountVowelsPermutationTest {
    private final CountVowelsPermutation solution = new CountVowelsPermutation();

    @Test
    void example1() {
        int result = solution.countVowelPermutation(5);
        assertEquals(68, result);
    }
}
