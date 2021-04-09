package string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class VerifyingAnAlienDictionaryTest {
    private final VerifyingAnAlienDictionary solution = new VerifyingAnAlienDictionary();

    @Test
    void example1() {
        assertTrue(solution.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    @Test
    void example2() {
        assertFalse(solution.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
    }

    @Test
    void example3() {
        assertTrue(solution.isAlienSorted(new String[]{"kuvp", "q"}, "ngxlkthsjuoqcpavbfdermiywz"));
    }

}
