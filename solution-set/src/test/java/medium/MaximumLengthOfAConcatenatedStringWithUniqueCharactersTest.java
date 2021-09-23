package medium;

import java.util.List;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthOfAConcatenatedStringWithUniqueCharactersTest {
    private final MaximumLengthOfAConcatenatedStringWithUniqueCharacters solution = new MaximumLengthOfAConcatenatedStringWithUniqueCharacters();

    @Test
    void example1() {
        int result = solution.maxLength(List.of("un", "iq", "ue"));
        assertEquals(4, result);
    }

    @Test
    void example2() {
        int result = solution.maxLength(List.of("cha", "r", "act", "ers"));
        assertEquals(6, result);
    }

    @Test
    void example3() {
        int result = solution.maxLength(List.of("abcdefghijklmnopqrstuvwxyz"));
        assertEquals(26, result);
    }
}